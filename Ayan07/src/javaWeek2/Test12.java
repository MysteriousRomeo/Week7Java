/*12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.
 */
package javaWeek2;

public class Test12 {
    public static void main(String[] args){
        Test12 test = new Test12();
        test.Calc(5,9,24);
    }

    public void Calc(float a, float b, float c){
        System.out.println("input number 1: " + (a));
        System.out.println("input number 2: " + (b));
        System.out.println("input number 3: " + (c));

        float avg = (a+b+c) / 3;
        System.out.println("Average of the above three numbers: " + avg);
    }
}
