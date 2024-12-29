package br.com.taskmanager;

import java.util.Scanner;

public class MenuTaskManager {
    Scanner scanner = new Scanner(System.in);
    public int selectedOption;
    Tasks tasks = new Tasks();

    public void displayMenuTaskManager(){
        System.out.println("=== Task Manager ===");
        System.out.println("1. Add Task");
        System.out.println("2. List Task's");
        System.out.println("3. Delete Task");
        System.out.println("4. Exit");
        System.out.print("Chose an Option: ");
    }

    public void executeSelectedOption (){
        if (scanner.hasNextInt()) {
            this.selectedOption = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println();
            System.out.println("Invalid input! Please enter an integer (1, 2, 3 or 4).");
            scanner.next();
        }

        switch (this.selectedOption){
            case 1: tasks.addTask();
            break;
            case 2: tasks.listTasks();
            break;
            case 3: tasks.deleteTask();
            break;
            case 4: tasks.exitTasks();
            break;
            default: System.out.println("Invalid Value !!!");
        }


    }
}
