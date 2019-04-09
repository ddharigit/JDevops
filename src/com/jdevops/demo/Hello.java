package com.jdevops.demo;

public class Hello {

	public static void main(String[] args) {

		int a = 4;
		int b = 14;
		System.out.println("Hello JDevops");
		
		System.out.println(Integer.toString(add(a,b)));
		//System.in.read(a);

		System.out.println("Input denominator");
		//System.in.read(b);

	}
	
	public static int add(int a , int b)
	{
		//sub(a,b);
		return a+b;
		
	}
	public int sub(int a , int b)
	{
		add(a,b);
		return a-b;
	}
	public int mul(int a , int b)
	{
		return a*b;
	}
	public int div(int a , int b)
	{
		return (b==0) ? 0 : a/b;
	}

}
