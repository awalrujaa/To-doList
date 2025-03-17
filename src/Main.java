import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        ToDoList todo = new ToDoList();

        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    \nTo-do List
                    *****************
                    """);
            System.out.println("1. Add a task.");
            System.out.println("2. View all tasks.");
            System.out.println("3. Remove a task.");
            System.out.println("4. Remove all tasks.");
            System.out.println("5. Update a task.\n");

            int num = Integer.parseInt(myObj.nextLine());

            switch (num) {
                case 1:
                    String taskName = myObj.nextLine();
                    todo.addTask(taskName);
                    break;

                case 2:
                    todo.displayTasks();
                    break;

                case 3:
                    int removeTask = myObj.nextInt();
                    todo.deleteTask(removeTask);
                    break;

                case 4:
                    todo.deleteTasks();
                    break;

                case 5:
                    System.out.println("Enter the number of task to update.");
                    int taskNum = Integer.parseInt(myObj.nextLine());
                    System.out.println("Enter the updated task.");
                    String updatedTask = myObj.nextLine();

                    todo.updateTask(taskNum, updatedTask);
                    break;

                default:
                    System.out.println("Invalid Task.");
            }

        }
    }
}