package com.demo;

public class Calculator {
	public int add(int a , int b)
	{
		return a+b;
	}
	
	public int factorial(int x)
	{
		if(x<1)
			throw new RuntimeException("value cannot be -ve");
		int f = 1;
		for(int i=1;i<=x;i++)
			f*=i;
		return f;
	}
}
