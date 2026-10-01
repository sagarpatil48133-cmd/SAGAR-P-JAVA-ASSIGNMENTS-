import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Second element: " + list.get(1));

        list.remove("Banana");
        list.removeFirst();

        System.out.println("After removing:");
        for (String item : list)
            System.out.println(item);
    }
}
