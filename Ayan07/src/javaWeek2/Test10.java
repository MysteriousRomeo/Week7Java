/*
10. Write a Java program that takes a number as input and prints its multiplication
table up to 10.
 */
package javaWeek2;

public class Test10 {
    public static void main(String[] args){
        Test10 test = new Test10();
        //using println
        test.multi(8);
        //using for loop
        test.multi2(4);
    }

    public void multi(int n){
        System.out.println("Test Data: Input a number: " + (n)+".");
        System.out.println("Expected Output:");
        System.out.println(n + " x 1 = " + (n*1));
        System.out.println(n + " x 2 = " + (n*2));
        System.out.println(n + " x 3 = " + (n*3));
        System.out.println(n + " x 4 = " + (n*4));
        System.out.println(n + " x 5 = " + (n*5));
        System.out.println(n + " x 6 = " + (n*6));
        System.out.println(n + " x 7 = " + (n*7));
        System.out.println(n + " x 8 = " + (n*8));
        System.out.println(n + " x 9 = " + (n*9));
        System.out.println(n + " x 10 = " + (n*10));
    }

    //Using For loop
    public void multi2(int n){
        System.out.println("Test Data: Input a number: " + (n)+".");
        System.out.println("Expected Output:");
        for (int x = 1; x <= 10; x++){
            System.out.println(n + " x "+ x +" = " + (n*x));
        }
    }
}
