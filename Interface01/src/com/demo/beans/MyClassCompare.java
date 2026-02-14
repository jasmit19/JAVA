package com.demo.beans;

import com.demo.interfaces.MyComparable;

public class MyClassCompare implements MyComparable{

	@Override
	public int compare(int x, int y) {
		System.out.println("in compare method of MyClassCompare");
		return x>y?x:y;
	}

}
