import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> tasks;

    public ToDoList(){
        tasks = new ArrayList<String> ();
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
    }

    public void deleteTask(int i) {
        if (i < tasks.size()){
            tasks.remove(i);
            System.out.println("Removed element " + i);
        }
    }

    public void deleteTasks() {
        tasks.clear();
        System.out.println("Removed all elements.");
    }

    public void updateTask(int num, String updatedTask) {
        tasks.set(num, updatedTask);
    }
}
