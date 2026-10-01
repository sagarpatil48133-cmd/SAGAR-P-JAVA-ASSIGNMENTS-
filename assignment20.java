20. Write a Java code for finding the largest element in an array.
public class LargestElement {
    public static void main(String[] args) {
        int[] a = {10, 50, 20, 80, 30};

        int largest = a[0];

        for (int n : a) {
            if (n > largest)
                largest = n;
        }

        System.out.println("Largest element = " + largest);
    }
}
