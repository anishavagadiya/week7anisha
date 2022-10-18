package Week7Javaprogramme;
// 19. Write a Java program to calculate the average value of array elements.

public class Programme19 {
    public static void main(String[] args) {

        int[] numbers = new int[]{10, 50, 20, -12, 60, -80};

        //calculate sum of all array elements
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) ;
        sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array element is: " + average);
    }
}


