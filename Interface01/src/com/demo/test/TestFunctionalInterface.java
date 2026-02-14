package com.demo.test;

import com.demo.beans.MyClassCompare;
import com.demo.interfaces.MyComparable;
import com.demo.interfaces.MyGeneric;
import com.demo.interfaces.MyGenericClass;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassCompare ob=new MyClassCompare();
		ob.compare(7, 12);
		
		//using Anonymous class
		MyComparable ob2=new MyComparable() {

			@Override
			public int compare(int x, int y) {
				// TODO Auto-generated method stub
				System.out.println("in Anonymous class compare "+x+" ,"+y);
				return 0;
			}
			
		};
		int compare = ob2.compare(4, 20);
		
		MyComparable ob3=(x,y)->{
			System.out.println("in compare method of MyComparable using Lambda Function "+ x +" ,"+ y);
			return 0;
		};
		int x=ob2.compare(76, 52);
		
		MyGenericClass<Integer> ob4=(a,b)->{
			return a+b;
		};
		System.out.println("hello "+ob4.compare(23, 45));
		
		MyGenericClass<String> ob5=(j,k)->{
			return j+k;
		};
		System.out.println(ob5.compare("jasmit", "lonhare"));
		
		MyGeneric<Integer> m1=(a, b)->{
			return a+b+20;
		};
	}

}
