package br.com.taskmanager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // List options in console
        MenuTaskManager menuTaskManager = new MenuTaskManager();

        do {
            menuTaskManager.displayMenuTaskManager();
            menuTaskManager.executeSelectedOption();
        } while (menuTaskManager.selectedOption != 4);
    }
}