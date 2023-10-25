/*
15. Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */
package javaWeek2;

public class Test15 {
    public static void main(String[] args){
        Test15 test = new Test15();
        test.Method();
    }

    public void Method(){
        String sentence = ("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");
        System.out.println("\nSample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");
        System.out.println("Output: " + sentence.toLowerCase());
    }
}
