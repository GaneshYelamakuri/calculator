package com.jsp.Calculatorpack;
import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args) 
	{
		switchCase();
	}
	public static void switchCase() {
	
		Scanner scn=new Scanner(System.in);
		
		Usable use = new Usable();
		
		boolean repeat = false;
		
		do {
			
			System.out.println("choose the option :");
			System.out.println(" 1. Addition"); 
			System.out.println(" 2. Substraction " );
			System.out.println(" 3. Multiplication" );
			System.out.println(" 4. division ");
			System.out.println("Enter the option:");
			int opt=scn.nextInt();
			
		switch(opt)
		{
		  case 1:
				System.out.println("Enter the Two Num:");
				int n=scn.nextInt();
				int m=scn.nextInt();
			    System.out.println(n+"+"+m +" = " +use.sumOfNum(n, m));
			    System.out.println("do you want to continue");
				System.out.println("1.Yes or 2.No");
				int cho=scn.nextInt();
		
			if(cho==1)switchCase();
			else {
				System.out.println("ThankYou Visit Again");
			  return;
			}
			  break;
			  
		  case 2:
				System.out.println("Enter the Two Num:");
				int i=scn.nextInt();
				int j=scn.nextInt();
			  
			  System.out.println(i+"-"+j +" = " +use.substrationOfNum(i, j));
			  System.out.println("do you want to continue");
				System.out.println("1.Yes or 2.No");
				int choice=scn.nextInt();
		
			if(choice==1)switchCase();
			else {
				System.out.println("ThankYou Visit Again");
			  return;
			}
			  break;
		  case 3:
				System.out.println("Enter the Two Num:");
				int k=scn.nextInt();
				int l=scn.nextInt();
			 
			    System.out.println(k+"*"+l +" = " +use.MultileOfNum(k, l));
			    System.out.println("do you want to continue");
				System.out.println("1.Yes or 2.No");
				int choic=scn.nextInt();
		
			    if(choic==1)switchCase();
			   else {
				System.out.println("ThankYou Visit Again");
			  break;
			}
			  break;
		 case 4:
				System.out.println("Enter the Two Num:");
				int num=scn.nextInt();
				int mem=scn.nextInt();
			 
			    System.out.println(num+"/"+mem +" = " +use.DivisonOfNum(num, mem));
				System.out.println("do you want to continue");
				System.out.println("1.Yes or 2.No");
				int ch=scn.nextInt();
		
			if(ch==1)switchCase();
			else {
				System.out.println("ThankYou Visit Again");
			  return;
			}
			break;
		default :
			System.out.println("please choose the correct option");
			repeat=true;
			break;
		
			}
		}while(repeat);	
	}
}
