import java.util.Scanner;

public class IT24102344Lab5Q3 {
    // Constants for room charges and discount rates
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final double DISCOUNT_RATE_3_4_DAYS = 0.10;
    public static final double DISCOUNT_RATE_5_OR_MORE_DAYS = 0.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start and end dates
        System.out.print("Enter the start date (day): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (day): ");
        int endDate = scanner.nextInt();

        // Validate the input dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        // Calculate the number of days reserved
        int daysReserved = endDate - startDate;

        // Determine the discount rate
        double discountRate = 0.0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_RATE_3_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_RATE_5_OR_MORE_DAYS;
        }

        // Calculate the total amount to be paid
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - discountRate);

        // Display the results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + totalAmount);

        scanner.close();
    }
}
