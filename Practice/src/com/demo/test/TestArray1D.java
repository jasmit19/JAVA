package com.demo.test;

import java.util.Scanner;

import com.demo.service.MyArrayService;

public class TestArray1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		MyArrayService.acceptData(arr);
		MyArrayService.displayData(arr);
		
		int choice;
		do {
			System.out.println("1. Search a number\n2. find max\n3. find min");
			System.out.println("4. add all numbers\n5. find all occurances\n6. find nth maximum");
			System.out.println("7. find nth minimum\n8.exit\n choice :");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("enter data to serch");
				int num=sc.nextInt();
				int pos=MyArrayService.searchByVal(arr,num);
				if(pos!=1) {
					System.out.println(num+" found at pos "+pos);
				}
				else {
					System.out.println("data not found");
				}
				break;
			}
			case 2:{
				int max=MyArrayService.findMax(arr);
				System.out.println(max+" is maximum number");
				break;
			}
			case 3:{
				int min=MyArrayService.findMin(arr);
				System.out.println(min+" is minimum number");
				break;
			}
			case 4:{
				int sum=MyArrayService.addData(arr);
				System.out.println("sum of all numbers: "+sum);
				break;
			}
			case 5:{
				System.out.println("enter data to search");
				int num=sc.nextInt();
				int[] arrpos=MyArrayService.findAllPos(arr,num);
				if(arrpos!=null){
					System.out.println("all positions are:");
					MyArrayService.displayData(arrpos);
				}
				else {
					System.out.println("num not found");
				}
				break;
			}
			case 6:{
				System.out.println("enter n");
				int n=sc.nextInt();
				int maxnum=MyArrayService.findNthMax(arr,n);
				System.out.println(n+"th maximun value: "+maxnum);
				break;
			}
			case 7:{
				System.out.println("enter n");
				int n=sc.nextInt();
				int minnum=MyArrayService.findNthMin(arr,n);
				System.out.println(n+"th maximun value: "+minnum);
				break;
			}
			case 8:{
				System.out.println("Thank you for visiting");
			}
			default:{
				System.out.println("wrong choice");
			}
			}
		}
		while(choice!=8);
	}

}
