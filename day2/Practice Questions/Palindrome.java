package day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;

        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        if (original == reversed)
            System.out.println("Palindrome: True");
        else
            System.out.println("Palindrome: False");

        sc.close();
    }
}
