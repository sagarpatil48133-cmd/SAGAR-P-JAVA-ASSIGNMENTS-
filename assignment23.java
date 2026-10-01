import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];

            if (map.containsKey(complement)) {
                int j = map.get(complement);

                if (j < i)
                    System.out.println("[" + j + ", " + i + "]");

                found = true;
                break;
            }

            map.put(a[i], i);
        }

        if (!found)
            System.out.println("[-1, -1]");
    }
