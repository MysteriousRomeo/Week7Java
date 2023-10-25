/*
9. Write a program to convert the upper case to lower case.
*/
package javaWeek2;
public class Test09 {
    public static void main(String[] args){
        Test09 test = new Test09();
        test.upperCase("AYAN");
    }

    public void upperCase(String name){
        System.out.print(name);
        name = name.toLowerCase();
        System.out.print(": Case changed to lower case: " + name);
    }



}
