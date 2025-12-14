package com.demo.test;

import java.util.Scanner;

import com.demo.service.MyArrayService2D;

public class TestArray2D 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no. of rows");
//		int row=sc.nextInt();
//		System.out.println("enter no. of cols");
//		int col=sc.nextInt();
		
		int[][] arr= {{4,5,6},{3,4,5},{1,2,3}};
		int[][] arr1= {{1,5,6},{3,2,7},{10,20,30}};
		
		//MyArrayService2D.displayData(arr);
		//MyArrayService2D.displayData(arr);
		
		int choice=sc.nextInt();
		do 
		{
			System.out.println("1. add all numbers\n2. add rowwise\n3.columnwise addition");
			System.out.println("4. find max of all numbers\n 5. maximum rowwise\n6. find maximum columnwise");
			System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
			System.out.println("10. check identity matrix\n11. rotate matrix rows\n 12. rotate matrix columns");
			System.out.println("13. convert to 1D array\n 14. exit\nchoice : ");
			
			switch(choice) 
			{
			
			case 1:
				int sum=MyArrayService2D.addAllNumbers(arr);
				System.out.println("Adition: "+sum);
				break;
			case 2:
				int[] arraddrow=MyArrayService2D.addRowWise(arr);
				
				for(int val:arraddrow) {  
					System.out.println(val);
				}
				break;
				
			case 3:
				int[] arraddcol=MyArrayService2D.addColumnWise(arr);
				break;
				
			//case 4:
				//int arrmax=
				
			default :
				System.out.println("choice is wrong");
			}
		}while(choice!=3);
	}

}
