import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        ToDoList todo = new ToDoList();

        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    \nTo-do List
                    Enter your choice below:
                    *****************
                    """);
            System.out.println("1. Add a task.");
            System.out.println("2. View all tasks.");
            System.out.println("3. Remove a task.");
            System.out.println("4. Remove all tasks.");
            System.out.println("5. Update a task.\n");

            // myObj.nextLine() call gets skipped after the myObj.nextInt() call
            // Therefore, we parse the integer from the string input
            // so myObj.nextLine() doesn't get skipped.
            int num = Integer.parseInt(myObj.nextLine());

            switch (num) {
                case 1:
                    todo.addTask();
                    break;

                case 2:
                    todo.displayTasks();
                    break;

                case 3:
                    todo.deleteTask();
                    break;

                case 4:
                    todo.deleteTasks();
                    break;

                case 5:
                    todo.updateTask();
                    break;

                default:
                    System.out.println("Invalid Task.");
            }

        }
    }
}