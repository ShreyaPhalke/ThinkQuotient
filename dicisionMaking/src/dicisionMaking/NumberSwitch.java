package dicisionMaking;

import java.util.Scanner;

public class NumberSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("one");
		break;
		case 2:System.out.println("two");
		break;
		case 3:System.out.println("three");
		break;
		case 4:System.out.println("four");
		break;
		case 5:System.out.println("five");
		break;
		default:System.out.println("invalid");
		}
	}

}
