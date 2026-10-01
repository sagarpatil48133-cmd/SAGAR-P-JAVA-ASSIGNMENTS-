import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Study Java");
        tasks.add("Complete Assignment");
        tasks.add("Attend Class");

        System.out.println("Tasks:");
        for (String task : tasks)
            System.out.println(task);

        tasks.remove("Complete Assignment");

        System.out.println("\nAfter Removing:");
        for (String task : tasks)
            System.out.println(task);
    }
}
