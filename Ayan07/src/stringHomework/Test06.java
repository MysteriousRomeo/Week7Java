//Write a java program which replace a “I@love@java” to “we love java”
//Expected output: We love java

package stringHomework;

public class Test06 {
    public static void main(String[] args) {
        String sentence01 = "I@love@java";
        System.out.println("Original Sentence: I@love@java");
        System.out.println("----------------------------");

        System.out.println(sentence01.replace("@", " ")); //using replace.
    }
}
