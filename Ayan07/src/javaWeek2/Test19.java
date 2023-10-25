/*
19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
 */
package javaWeek2;

public class Test19 {
    static String member1 = "Miten";          //static variable
    String member2 = "Zarna";                 //instance variable
    public static void main(String[] args){
        String localVariable03 = "All the groups are equally working hard"; //local variable
        Test19 test = new Test19();
        test.selenium();
        agile();
        System.out.println(localVariable03);
    }

    //Instance Method
    public void selenium(){
        String localVariable01 = "Selenium Group members";  //local variable
        System.out.println(localVariable01);
        System.out.println(member1);    //calling static variable
        System.out.println(member2);    //calling instance variable
    }
    //Static Method
    public static void agile(){
        String localVariable02 = "Agile Group members"; //local variable
        System.out.println(localVariable02);
        Test19 test = new Test19();
        System.out.println(member1);         //calling static variable
        System.out.println(test.member2);    //calling instance variable

    }
}
