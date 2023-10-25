//2. Write a java program which remove extra space from both side “ I love  java ”
//Expected output: “I love java”

package stringHomework;

public class Test02 {
    public static void main(String[] args) {
        String sentence = " I love java ";

        System.out.println(sentence.trim());   // "trim()" is used here to remove extra spaces.
    }
}
