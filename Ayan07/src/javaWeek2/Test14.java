/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
package javaWeek2;

public class Test14 {
    public static void main(String[] args){
        Test14 test = new Test14();
        test.Method(125,24);
    }

    public void Method(int x, int y){
        System.out.println("Input first number:" + x);
        System.out.println("Input second number:" + y);
        System.out.println("Expected Output:");
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " x " + y + " = " + (x*y));
        System.out.println(x + " / " + y + " = " + (x/y));
        System.out.println(x + " mod " + y + " = " + (x%y));
    }
}
