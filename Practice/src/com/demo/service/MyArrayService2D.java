package com.demo.service;

import java.util.Scanner;

public class MyArrayService2D {

	public static void acceptData(int[][] arr, int row, int col) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter data for row "+i+"\nenter data for column "+j);
				arr[i][j]=sc.nextInt();
			}		
		}	
	}

	public static void displayData(int[][] arr) {
		//arr.length gives the no. of rows in a 2D array
		for(int i=0;i<arr.length;i++) {
			//arr[0].length gives the length of 1st row i.e. column length
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(+arr[i][j]+"\t");
				}
			System.out.println();
		}
	}

	public static int addAllNumbers(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			}
		return sum;
	}

	public static int[] addRowWise(int[][] arr) {
		int[] temp=new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				temp[i]+=arr[i][j];
			}
			System.out.println("sum of number in row "+i+" = "+temp);
			}
		return temp;
	}

	public static int[] addColumnWise(int[][] arr) {
		int[] temp=new int[arr.length-1];
		//iterates through the columns
		for(int i=0;i<arr[0].length;i++) {
			//initialize addition of every column to zero before the loop begins
			temp[i]=0;
			//iterates through the rows
			for(int j=0;j<arr.length;j++) {
				//it will iterate like arr[0][0] [1][0] [2][0] --> [1][1] [2][1] [3][1]
				temp[i]+=arr[j][i];
			}
			System.out.println("sum of number in column "+i+" = "+temp);
		}
		return temp;
	}
	
	
}
