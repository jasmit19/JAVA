package com.demo.beans;

import java.util.Scanner;

public class LongestStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
            }
        }

        System.out.println("Length of the longest string: " + maxLength);
    }
}
