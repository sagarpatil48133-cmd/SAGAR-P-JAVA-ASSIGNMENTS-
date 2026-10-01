public class ArraySumAverage {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int n : a)
            sum += n;

        double average = (double) sum / a.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
