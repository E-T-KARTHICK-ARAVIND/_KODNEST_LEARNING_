package greet;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String x=scan.next();
	String res=name(x); 
	System.out.println(res);
	int a=scan.nextInt();
	int res1=age(a);
	System.out.println("age is "+res1);
	System.out.println("hello " +res+ " how are you");
	
    
	}
	public static String name(String a ) {
		return a;
		
	}
	public static int age(int x)
	{
		return x;
	}

}
