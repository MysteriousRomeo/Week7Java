/*
Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).
*/
package javaWeek2;
public class Test07 {

    //declaring the Main Method
    public static void main(String[] args){
        Test07 test = new Test07();
        test.temp(27.9f);
    }

    //declaring instance method
    public void temp(float far){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Degree Fahrenheit converted to degree celcius: " + ((far-32) * 5/9));
        System.out.println("------------------------------------------------------------------------");
    }

}
