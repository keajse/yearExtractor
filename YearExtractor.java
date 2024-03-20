import java.util.Scanner;

public class YearExtractor {
    public static void main(String[] args) {

        System.out.println(welcome());

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the ID card number:");
        long idNumber = scanner.nextLong();

        // Extract the first two digits representing the year
        int year = extractYear(idNumber);

        System.out.println("The extracted year is: " + year);
    }

    public static int extractYear(long idNumber) {
        // Convert the number to a string for easier manipulation
        String idStr = Long.toString(idNumber);

        // Extract the first two digits
        String yearStr = idStr.substring(0, 2);

        // Convert the year string to an integer
        int year = Integer.parseInt(yearStr);

        return year;
    }

    static String welcome(){
        String messageWelcome = "Peace and good, my name is Laura Juliana Serrano\n";

        return messageWelcome;
    }
}
