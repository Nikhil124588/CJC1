package com.cjc.array3highestno;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
int a[]= {10,15,20,78,14,16,15,10000,17,8};
int n;


do {
	System.out.println("Enter the no.");
	n=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		
			if(n==a[i])
			{
						
						System.out.println("no. is present ");
						break;
			}
			else if(i==a.length-1)//else if(n!=a[i]
			{
				System.out.println("no. is not present");	
			}
	}
	
}while(n!=0);	
}
}
