package day2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong: True");
        else
            System.out.println("Armstrong: False");

        sc.close();
    }
}