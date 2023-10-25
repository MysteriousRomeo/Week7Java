/*
20. Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.
 */
package javaWeek2;

public class Test20 {
    static String country1 = "Spain";          //static variable
    String country2 = "United Kingdom";        //instance variable
    public static void main(String[] args){
        Test20 test = new Test20();

        test.homeCountry();
        holidays();
    }

    //Instance Method
    public void homeCountry(){
        System.out.println(country1);
    }
    //Static Method
    public static void holidays(){
        Test20 test = new Test20();
        System.out.println(test.country2);
    }
}
