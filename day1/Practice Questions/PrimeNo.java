package com.demo.beans;

import java.util.Scanner;

public class PrimeNo {
		public static boolean isPrime(int num) {
				
				if(num <=1 ) return false;
				
				if(num ==2 ) return true;
				
				for(int i=2; i<=num/2; i++) {
					if(num%i==0) return false;
					break;
				}
				return true;
			}


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number:");
				int n=sc.nextInt();
				
				if(isPrime(n)) {
					System.out.println("Prime");
				}

				else {
					System.out.println("Not Prime");

			}
			
		}

}
