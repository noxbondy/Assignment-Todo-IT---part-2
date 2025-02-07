package org.opp1;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("nour el houda", "gulamnoxbondy@gmail.com");
        Person person2 = new Person("noxbondy", "nourelhouda@gmail.com");
        

        TodoItem todoItem1 = new TodoItem("Buy groceries", false);
        TodoItem todoItem2 = new TodoItem("Finish homework", true);

        TodoItemTask task1 = new TodoItemTask(todoItem1, person1);
        TodoItemTask task2 = new TodoItemTask(todoItem2, person2);

        AppUser user1 = new AppUser("nour el houda", "password123", AppRole.ADMIN);
        AppUser user2 = new AppUser("noxbndy", "mypassword", AppRole.USER);

        // Print the instances
        System.out.println(person1);
        System.out.println(person2);

        System.out.println(todoItem1);
        System.out.println(todoItem2);

        System.out.println(task1);
        System.out.println(task2);

        System.out.println(user1);
        System.out.println(user2);

        // Test equals and hashCode
        System.out.println("Are users equal? " + user1.equals(user2));
        System.out.println("User1 hashCode: " + user1.hashCode());
        System.out.println("User2 hashCode: " + user2.hashCode());


    }
}