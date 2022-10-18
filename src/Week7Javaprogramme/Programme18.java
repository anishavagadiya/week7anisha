package Week7Javaprogramme;
//18. Write a Java program to sum values of an array.

import java.util.Arrays;

public class Programme18 {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i =0; i<my_array.length;i++){
            sum =sum + my_array[i];
        }
        System.out.println("The Array Value:" + Arrays.toString(my_array));
        System.out.println("The sum is " + sum);
    }

}
