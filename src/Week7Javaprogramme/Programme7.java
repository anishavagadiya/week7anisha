package Week7Javaprogramme;

import java.util.Scanner;

public class Programme7 {
    public static void main(String arg[]) {
input();
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales Id");
        int salesId = scanner.nextInt();
        System.out.println("Enter Seller name");
        String sellername = scanner.next();
        System.out.println("Enter sales amount");
        int salesamout = scanner.nextInt();
        System.out.println("Enter basic salary");
        double basicsalary = scanner.nextInt();
        double commission;
        if (salesamout > 50000) {
            commission = (salesamout * 35) / 100;
            System.out.println("sellers@s commission is : " + commission);
        } else if (salesamout > 30000) {
            commission = (salesamout * 20) / 100;
            System.out.println("Seller's commission is : " + commission);
        } else if (salesamout >=20000) {
            commission = (salesamout * 5) / 100;
            System.out.println("sellers commission is : " + commission);
        } else if (salesamout >= 10000) {
            commission = (salesamout * 5) / 100;
            System.out.println("seller's commission is: " + commission);
        }else {
            commission = (salesamout *2) / 100;
            System.out.println("seller's commission is: " + commission);
        }

    }
    }



