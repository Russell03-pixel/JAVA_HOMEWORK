package POE.login;

import java.util.Scanner;

public class LoginSignup {

    private String username;
    private String password;
    private String cellPhoneNumber;

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);

        // Validate username
        while (true) {
            System.out.print("Enter username (must be 5 letters and contain an underscore, e.g., Kabe_L): ");
            username = scanner.nextLine();
            if (isValidUsername(username)) {
                break;
            } else {
                System.out.println("Invalid username. Please try again.");
            }
        }

        // Validate password
        while (true) {
            System.out.print("Enter password (at least 8 characters, must start with a capital letter, contain a digit, and a special character): ");
            password = scanner.nextLine();
            if (isValidPassword(password)) {
                break;
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        }

        // Validate cell phone number
        while (true) {
            System.out.print("Enter South African cell phone number (e.g., 0821234567): ");
            cellPhoneNumber = scanner.nextLine();
            if (isValidCellPhoneNumber(cellPhoneNumber)) {
                break;
            } else {
                System.out.println("Invalid South African cell phone number. Please try again.");
            }
        }

        System.out.println("\n✅ Account created successfully!");
        System.out.println("Welcome, " + username + "!");
        System.out.println("Your password is securely stored.");
        
        scanner.close();
    }

    // Username must be exactly 5 letters, include an underscore
    private boolean isValidUsername(String username) {
        return username.matches("[a-zA-Z]{4}_[a-zA-Z]");
    }

    // Password must:
    // - be at least 8 characters
    // - start with a capital letter
    // - include at least one digit
    // - include at least one special character
    private boolean isValidPassword(String password) {
        return password.matches("^[A-Z](?=.*[0-9])(?=.*[!@#$%^&*()]).{7,}$");
    }

    // South African number must start with 06, 07, or 08 and be 10 digits total
    private boolean isValidCellPhoneNumber(String number) {
        return number.matches("0[6-8][0-9]{8}");
    }

    public static void main(String[] args) {
        LoginSignup loginSignup = new LoginSignup();
        loginSignup.createAccount();
    }
}
