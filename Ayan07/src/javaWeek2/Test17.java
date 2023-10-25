/*
17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.
 */
package javaWeek2;

public class Test17 {
    String city = "London";         //instance variable
    static String country = "UK";   //static variable
    public static void main(String[] args){
        Test17 test = new Test17();
        test.method();
        method02();
    }

    //Instance Method
    public void method(){
        System.out.println(country);    //calling static variable
    }
    //Static Method
    public static void method02(){
        Test17 test = new Test17();
        System.out.println(test.city);    //calling instance variable
    }
}
