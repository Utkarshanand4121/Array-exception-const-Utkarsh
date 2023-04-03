package com.Utkarsh;

import java.util.Scanner;
class Addition
{
	public void show()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int a,b,c;
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		System.out.println(c);
	}
}







public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Hi from main");
      Addition xyz=new Addition();
      xyz.show();
      System.out.println(xyz);
	}

}
