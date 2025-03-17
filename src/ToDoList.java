import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<String> tasks;

    public ToDoList(){
        tasks = new ArrayList<String> ();
    }

    public void addTask() {
        System.out.println("Enter the task to add.");
        String taskName = scanner.nextLine();
        tasks.add(taskName);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in To-do List currently.");
            return;
        }

//        for(String task: tasks) System.out.println(task);

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
    }

    public void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("The to-do list is empty.");
            return;
        }
        System.out.println("Enter which task you want to delete.");
        int removeTaskIndex = Integer.parseInt(scanner.nextLine());
        if (removeTaskIndex<=0){
            System.out.println("invalid index for task");
            return;
        }
        if (removeTaskIndex > 0 & removeTaskIndex <= tasks.size()){
            tasks.remove(removeTaskIndex-1); // i-1 as the user thinks of 1-based array indexing
            System.out.println("Removed element " + removeTaskIndex);
        }
        else {
            System.out.println("The task doesn't exist.");
        }
    }

    public void deleteTasks() {
        if (tasks.isEmpty()) {
            System.out.println("The to-do list is already empty.");
            return;
        }
        tasks.clear();
        System.out.println("Removed all elements.");
    }

    public void updateTask() {
        if (tasks.isEmpty()) {
            System.out.println("The to-do list is already empty.");
            return;
        }
        System.out.println("Enter the number of task to update.");
        int num = Integer.parseInt(scanner.nextLine());
        if (num > 0 & num <= tasks.size()){
            System.out.println("Enter the updated task.");
            String updatedTask = scanner.nextLine();
            tasks.set(num - 1, updatedTask);
        } // User uses 1-based array indexing

        else {
            System.out.println("The task does not exist.");
        }

    }
}
