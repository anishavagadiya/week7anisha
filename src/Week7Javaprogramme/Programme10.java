package Week7Javaprogramme;
//10.Write a java program to input any two number and ask user to enter their symbol (+, -,
    //    /, *) find addition, Subtraction, multiplication and division according to their symbol
   //    (using if else)

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition of"+num1+"+"+num2+"="+(num1+num2));
        System.out.println("Substraction of"+num1+"-"+num2+"="+(num1-num2));
        System.out.println("Multiplication of"+num1+"x"+num2+"="+(num1*num2));
        System.out.println("Division of"+num1+"/"+num2+"="+(num1/num2));
    }


}
