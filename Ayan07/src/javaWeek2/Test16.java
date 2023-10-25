/*
16. Write a Java Program to print as below. (All details to be stored in variable)

"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.89 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"
 */
package javaWeek2;

public class Test16 {
    public static void main(String[] args){
        Test16 test = new Test16();
        test.Method();
    }

    public void Method(){
        String line1 = ("\"+-------------------------+\"");
        String line2 = ("\"|                         |\"");
        String line3 = ("\"|  CORNER STORE           |\"");
        String line4 = ("\"|                         |\"");
        String line5 = ("\"|  2015-03-29 04:38 PM    |\"");
        String line6 = ("\"|                         |\"");
        String line7 = ("\"|  Gallons: 10.870        |\"");
        String line8 = ("\"|  Price/gallon: $ 2.89   |\"");
        String line9 = ("\"|                         |\"");
        String line10 = ("\"|  Fuel total: $ 22.71   |\"");
        String line11 = ("\"|                        |\"");
        String line12 = ("\"+------------------------+\"");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
        System.out.println(line8);
        System.out.println(line9);
        System.out.println(line10);
        System.out.println(line11);
        System.out.println(line12);

    }
}
