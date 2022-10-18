package Week7Javaprogramme;
//6. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        scanner.close();
        if (num % 2 == 0) {
            System.out.println(num + "is Even");
        } else {
            System.out.println(num + "is Odd");

        }
    }
}
