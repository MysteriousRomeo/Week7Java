/*
11. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889
 */
package javaWeek2;

public class Test11 {
    public static void main(String[] args){
        Exp();
    }

    public static void Exp(){
        System.out.println("Test Data:");
        System.out.println("    ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))");
        System.out.println("Expected Output: " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

}
