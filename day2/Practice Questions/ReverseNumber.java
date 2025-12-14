package day2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reversed = 0;

        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}