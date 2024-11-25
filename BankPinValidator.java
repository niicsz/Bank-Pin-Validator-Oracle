import java.util.Scanner;

public class BankPinValidator {

    public static void main(String[] args) {
        final int VALID_PIN = 1234;
        
        Scanner scanner = new Scanner(System.in);
        int userPin;
        
        System.out.println("Welcome to the bank! Please enter your 4-digit PIN:");
        while (true) {
            userPin = scanner.nextInt();
            
            if (userPin == VALID_PIN) {
                System.out.println("Correct PIN entered. You now have access to your account.");
                break;
            } else {
                System.out.println("Incorrect PIN. Please try again:");
            }
        }
        
        scanner.close();
    }
}
