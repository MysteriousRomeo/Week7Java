/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.
*/
package javaWeek2;
public class Test02 {
    //declaring two instance variables
    static int a = 5;
    static int b = 10;
    //declaring the Main Method
    public static void main(String[] args){
        sum();
    }

    //declaring one static method
    public static void sum(){
        System.out.println(a+b);    //Calling both static variables inside the print statement.
    }
}
