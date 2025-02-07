package org.opp1;
import java.util.Objects;

public class TodoItem {
    private String taskName;
    private boolean completed;

    public TodoItem(String taskName, boolean completed) {
        this.taskName = taskName;
        this.completed = completed;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return taskName.equals(todoItem.taskName);
    }

    @Override
    public int hashCode() {
        return taskName.hashCode();
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "taskName='" + taskName + '\'' +
                ", completed=" + completed +
                '}';
    }
}