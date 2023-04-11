package dicisionMaking;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num%2)
		{
		case 0:
			System.out.println("even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
			default :System.out.println("invalid number");
		}
	}

}
