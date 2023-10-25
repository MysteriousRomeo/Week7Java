/*
Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
*/
package javaWeek2;
public class Test05 {

    //declaring the Main Method
    public static void main(String[] args){
        //creating instance of the class
        Test05 test = new Test05();
        //calling instance methods
        test.addition(10, 20);
        test.subtraction(25, 5);
        //calling Static methods
        multiplication(20, 10);
        division(20,2);

    }

    //declaring one static method
    public void addition(int a, int b) {
        System.out.println("Addition of 2 digits = " + (a + b));
    }
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of 2 digits = " + (a - b));
    }
    public static void multiplication(int a, int b) {
        System.out.println("Multiplication of 2 digits = " + (a * b));
    }
    public static void division(int a, int b) {
        System.out.println("Division of 2 digits = " + (a / b));
    }
}
