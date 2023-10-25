/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/
package javaWeek2;
public class Test03 {
    //declaring one instance and one static variable
    static int a = 5;
    int b = 10;

    //declaring the Main Method
    public static void main(String[] args){
        sum();
    }

    //declaring one static method
    public static void sum(){
        Test03 test03 = new Test03();
        System.out.println(a+ test03.b);    //Calling both instance variable and static variable.
    }
}
