import java.io.Console;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "1234";
        int attempts = 3;

        Scanner sc = new Scanner(System.in);
        Console console = System.console();

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String inputUser = sc.nextLine();

            String inputPass;
            if (console != null) {
                char[] passwordChars = console.readPassword("Enter password: ");
                inputPass = new String(passwordChars);
            } else {
                // Fallback for IDEs that don't support Console
                System.out.print("Enter password: ");
                inputPass = sc.nextLine();
            }

            if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD)) {
                System.out.println("✅ Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("❌ Invalid credentials. Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("🚫 You have been locked out after 3 failed attempts.");
            }
        }

        sc.close();
    }
}
