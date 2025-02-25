package org.opp1.AppRole;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private LocalDate deadline;
    private boolean done;

    public TodoItem(int id, String title, LocalDate deadline) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.done = false;
    }

    public void markDone() { this.done = true; }
    public boolean isDone() { return done; }

    @Override
    public String toString() {
        return "Todo: " + title + " (Deadline: " + deadline + ") [" + (done ? "Done" : "Pending") + "]";
    }
}
