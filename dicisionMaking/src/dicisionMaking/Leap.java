package dicisionMaking;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%100==0 && num%400==0|| num%100!=0 && num%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}
