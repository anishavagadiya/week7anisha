package Week7Javaprogramme;
// WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

import java.util.Scanner;

public class Programme5 {
    static int employeed, basicsalary;
    static String name;
   static float hra, da, ta,pf, grosssalary;

    public static void main(String[] args) {
        data();

    }
public static void data(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter employee name:");
    name = scanner.nextLine();
    System.out.println("Enter employee id:");
    int employeeID = scanner.nextInt();
    System.out.println("Enter employee's basic salary:");
    int basicsalary = scanner.nextInt();
    hra = (basicsalary * 10) / 100f;
    da = (basicsalary * 8) / 100f;
    ta = (basicsalary * 9) / 100f;
    pf = (basicsalary * 20) / 100f;
    }

}
