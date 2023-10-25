//1. Write a Java program print your full name on screen and then print your  surname on a separate line.

package stringHomework;

public class Test01 {
    public static void main(String[] args) {
        String firstName = "Ayan";
        String lastName = "Roy";
        System.out.println("FirstName: " + firstName + "\nSurname: " + lastName);

        //another way
        System.out.println("--------------------------------------");
        System.out.println("Ayan\nRoy");
    }
}
