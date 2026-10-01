public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Java is a programming language";

        String[] words = sentence.split(" ");

        System.out.println("Words:");
        for (String word : words)
            System.out.println(word);

        System.out.println("\nNew Format:");
        for (String word : words)
            System.out.print(word.toUpperCase() + "-");
    }
}
