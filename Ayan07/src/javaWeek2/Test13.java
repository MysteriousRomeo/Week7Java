/*
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:

Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
package javaWeek2;

public class Test13 {
    public static void main(String[] args){
        Test13 test = new Test13();
        test.Method(5.5,8.5);
    }

    public void Method(double w, double h){
        System.out.println("Test Data:");
        System.out.println("    Width = " + w + " Height = " + h);
        System.out.println("Expected Output:");
        System.out.println("    Area is " + w + " * " + h + " = " + (w*h) );
        System.out.println("    Perimeter is " + 2 + " * " + "("+ w + " + " + h + ") = " + (2*(w+h)));
    }
}
