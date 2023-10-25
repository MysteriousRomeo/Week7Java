//3. Write a java program which replace a “I love java” to “we love java” Expected output: We love java

package stringHomework;

public class Test03 {
    public static void main(String[] args) {
        String sentence = "I love java";
        System.out.println(sentence);
        System.out.println("-------replaced------");

        System.out.println(sentence.replace("I", "we"));   // "replace()" is used here to replace text.
    }
}
