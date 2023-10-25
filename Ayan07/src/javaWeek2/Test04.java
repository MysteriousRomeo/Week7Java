/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
package javaWeek2;
public class Test04 {
    //declaring two instance and two static variables
    static int a = 5; static int b = 10;
    int x = 15; int y = 20;

    //declaring the Main Method
    public static void main(String[] args){
        Test04 test04  = new Test04();
        test04.method01();
        method02();
    }

    //declaring one instance method
    public void method01(){
        System.out.println("Method01 result: " + (a +b + x +y));    //Calling both instance variable and static variable.
    }

    //declaring one static method
    public static void method02(){
        Test04 test04 = new Test04();
        System.out.println("Method02 result: " + (a +b + test04.x +test04.y));    //Calling both instance variable and static variable.
    }
}
