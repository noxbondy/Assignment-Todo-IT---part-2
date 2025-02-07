package org.opp1;

import java.util.Objects;

public class TodoItemTask {
    private TodoItem todoItem;
    private Person person;

    public TodoItemTask(TodoItem todoItem, Person person) {
        this.todoItem = todoItem;
        this.person = person;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return todoItem.equals(that.todoItem) && person.equals(that.person);
    }

    @Override
    public int hashCode() {
        return 31 * todoItem.hashCode() + person.hashCode();
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "todoItem=" + todoItem +
                ", person=" + person +
                '}';
    }
}
