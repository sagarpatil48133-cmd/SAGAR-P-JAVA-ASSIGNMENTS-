import java.util.HashSet;

public class DistinctAbsolute {
    public static void main(String[] args) {
        int[] a = {-5, 5, -2, 2, 3, -3, 7};

        HashSet<Integer> set = new HashSet<>();

        for (int n : a)
            set.add(Math.abs(n));

        System.out.println("Number of distinct absolute values = "
                           + set.size());
    }
}
