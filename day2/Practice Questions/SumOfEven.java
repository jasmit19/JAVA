package day2;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }

        System.out.println("Sum of first " + n + " even numbers: " + sum);
        sc.close();
    }
}
