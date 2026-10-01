import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        String[] words = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        HashMap<String, Integer> groups = new HashMap<>();

        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            groups.put(key, groups.getOrDefault(key, 0) + 1);
        }

        System.out.println("Number of anagramic groups = "
                           + groups.size());
    }
}
