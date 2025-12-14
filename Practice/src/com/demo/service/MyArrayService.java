package com.demo.service;
import java.util.Scanner;

public class MyArrayService {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int size;
//		size=sc.nextInt();
//		int[] arr=new int[size];
//		
		//1.initialize the array
		//acceptData(arr);
		
		//2.sum of all elements in an array
		//int sum=addData(arr);
		//System.out.println("Addition : "+sum);
		
		//3.display 
		//displayData(arr);
		
		//4.find position by value
//		System.out.println("enter val=");
//		int val=sc.nextInt();
//		int pos=searchByVal(arr,val);
//		
//		if(pos!=-1) {
//        	System.out.println(f+" Found at position : "+pos);
//        }else {
//        	System.out.println(f+ "not found");
//        }
//		
		//5.smallest
		//int min=findMin(arr);
		
		//6.largest
		//int max=findmax(arr);

	public static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	public static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

	public static int searchByVal(int[] arr, int val) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		return -1;
	}

	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("i= "+arr[i]);
		}
		
	}

	public static int addData(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
	}

	public static int[] findAllPos(int[] arr, int num) {
		int[] temp=new int[arr.length-1];
		int cnt=0;
		for(int i=0;i<temp.length;i++) {
			temp[i]=-1;
		}
		for(int i=0;i<temp.length;i++) {
			if(arr[i]==num) {
				temp[cnt]=i;
				cnt++;
		}
			if(cnt>0) {
				return temp;
			}
	}
		return temp;

}

	public static int findNthMax(int[] arr, int n) {
		int pos=0;
		for(int i=0;i<n;i++) {
			pos=findMax(arr);
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return pos;
	}

	public static int findNthMin(int[] arr, int n) {
		int pos=0;
		for(int i=0;i<n;i++) {
			pos=findMin(arr);
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return pos;
	}
}
