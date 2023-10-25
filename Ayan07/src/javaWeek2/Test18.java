/*
18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.
 */
package javaWeek2;

public class Test18 {
    static String council = "Chatham";          //static variable
    String houseNumber = "68";                  //instance variable
    public static void main(String[] args){
        Test18 test = new Test18();
        test.borough();
        address();
    }

    //Instance Method
    public void borough(){
        System.out.println(council);    //calling static variable
    }
    //Static Method
    public static void address(){
        Test18 test = new Test18();
        System.out.println(test.houseNumber);    //calling instance variable
    }
}
