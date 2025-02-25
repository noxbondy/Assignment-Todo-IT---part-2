package org.opp1.AppRole;

import org.opp1.AppUser;

public class TodoItemTask {
    private int id;
    private TodoItem todoItem;
    private AppUser assignee;

    public TodoItemTask(int id, TodoItem todoItem, AppUser assignee) {
        this.id = id;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return todoItem + " assigned to " + assignee.getFirstName();
    }
}
