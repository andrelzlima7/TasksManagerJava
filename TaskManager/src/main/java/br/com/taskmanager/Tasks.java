package br.com.taskmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    private final ArrayList<String> tasks = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addTask() {
        System.out.print("Enter new task: ");
        String task = scanner.nextLine();
        this.tasks.add(task);
        System.out.println("Task \"" + task + "\" added successfully!");
        System.out.println();
    }

    public void listTasks() {
        System.out.println("=== Task List ===");
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
        System.out.println();
    }

    public void deleteTask(){
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks");
        } else {
            listTasks();
            int index;
            System.out.print("Which task to delete ? ");
            index = scanner.nextInt();

            if (index > tasks.size()){
                System.out.println("Invalid Value");
            } else {
                tasks.remove(index - 1);
                System.out.println("Task deleted successfully !!!");
            }
        }

        System.out.println();
    }

    public void exitTasks (){
        System.out.println("Finishing...");
        System.out.println();
    }
}