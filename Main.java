package org.opp1;

import org.opp1.AppRole.AppRole;
import org.opp1.AppRole.TodoItem;
import org.opp1.AppRole.TodoItemTask;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AppUser user1 = new AppUser(10,"nour","tayar","nour@gmail.com","elnour","password","secure123", AppRole.USER);
        TodoItem task1 = new TodoItem(101, "Finish Java Project", LocalDate.of(2025, 3, 1));
        TodoItemTask taskAssignment = new TodoItemTask(201, task1, user1);

        System.out.println(user1);
        System.out.println(taskAssignment);


        }

    }
