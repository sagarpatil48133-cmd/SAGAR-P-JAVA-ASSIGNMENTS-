public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
