import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    System.out.println(year + " is not a leap year.");
                } else {
                    System.out.println(year + " is a leap year.");
                }
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Invalid year. Year must be >= 1582.");
        }
    }
}
