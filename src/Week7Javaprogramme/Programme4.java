package Week7Javaprogramme;

public class Programme4 {
    public static void main(String[] args) {
    }
    public static void isLeapyear(int year) {
        boolean result = false;
        if (year >= 1 && year <= 9999) {
        } else {
            System.out.println(result = false);
        }
        boolean ans;
        if (year == (year % 4)) {
            if (year == (year % 100)) {
                ans = result;
            }
        }
        if (year == (year % 100)) {
            if (year == (year % 400)) {
                ans = result;
            }
        } else {
            if (year == (year % 400)) {
                ans = result;
            }
        }
    }
}