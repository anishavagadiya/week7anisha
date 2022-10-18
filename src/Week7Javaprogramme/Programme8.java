package Week7Javaprogramme;

import java.util.Scanner;



public class Programme8 {
    public static void main(String[] args) {
        System.out.println("Print city name A to F");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        Prograsmme8 obj = new Prograsmme8();
        obj.cityname();

    }

    public void cityname() {
        char city = 0;
        if (city == 'a' || city == 'A') {
            System.out.println("Ahmdabad");
        } else if (city == 'b' || city == 'B') {
            System.out.println("Bhuj");
        } else if (city == 'c' || city == 'C') {
            System.out.println("Chennai");
        } else if (city == 'd' || city == 'D') {
            System.out.println("Diu");
        } else if (city == 'e' || city == 'E') {
            System.out.println("East London");
        } else if ((city == 'f' || city == 'F')) {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Entry");

        }

    }


    public static class Prograsmme8 {
        public static void main(String[] args){
            System.out.println("Print city name A to F");
            Scanner a = new Scanner(System.in);
             String b = a.nextLine();
    Prograsmme8 obj = new Prograsmme8();
    obj.cityname();

        }
        public void cityname(){
            char city = 0;
            if (city == 'a' || city == 'A'){
             System.out.println("Ahmdabad");
         } else if(city =='b' || city == 'B'){
             System.out.println("Bhuj");
         } else if (city == 'c' || city == 'C') {
             System.out.println("Chennai");
         } else if (city == 'd' || city == 'D') {
             System.out.println("Diu");
         } else if (city == 'e' || city == 'E') {
             System.out.println("East London");
         } else if ((city == 'f' || city == 'F')) {
             System.out.println("FA");

         }

        }

        }
}