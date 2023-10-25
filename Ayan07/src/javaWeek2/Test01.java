/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.
*/
package javaWeek2;
public class Test01 {
    //declaring two instance variables
    int a = 5;
    int b = 10;
    //declaring the Main Method
    public static void main(String[] args){
        Test01 test01 = new Test01();   //Calling the instance method into the Main method
        test01.sum();
    }

    //declaring one instance method
    public void sum(){
        System.out.println(a+b);    //Calling both instance variables inside the print statement.
    }
}
