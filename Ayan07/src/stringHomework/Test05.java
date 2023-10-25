//5. Write a java program to concat 2 string.
//Expected output: I love java I dream java

package stringHomework;

public class Test05 {
    public static void main(String[] args) {
        String sentence01 = "I love java";
        String sentence02 = "I dream java";

        System.out.println(sentence01.concat(" " + sentence02)); //using concat to add 2 strings.
    }
}
