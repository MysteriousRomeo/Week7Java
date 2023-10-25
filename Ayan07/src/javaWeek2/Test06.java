/*
Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r).
*/
package javaWeek2;
public class Test06 {

    //declaring the Main Method
    public static void main(String[] args){
        Test06 test = new Test06();
        test.area(25);
        test.area(10);
        test.area(2.5f);

    }

    //declaring instance method
    public void area(float r){
        float pi = 3.1415f; //Declaring locally value of pi
        System.out.println("Area of circle = "+ (pi * r * r ));

    }

}
