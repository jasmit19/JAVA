import java.util.Scanner;

public class AlphaNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isAlphanumeric = true;

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric)
            System.out.println("The string contains only alphanumeric characters.");
        else
            System.out.println("The string contains non-alphanumeric characters.");

        sc.close();
    }
}