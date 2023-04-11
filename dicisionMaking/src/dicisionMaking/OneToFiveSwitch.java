package dicisionMaking;

import java.util.Scanner;

public class OneToFiveSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
		System.out.println("1");
	case 2:
		System.out.println("2");
	case 3:
		System.out.println("3");
	case 4:
		System.out.println("4");
	case 5:
		System.out.println("5");
		break;
		default:System.out.println("invalid");
		//sc.close();
	}
	}
}
