package dicisionMaking;

import java.util.Scanner;

public class ThaliMenuSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Maharashtrian Thali - 150");
		System.out.println("2.panjabi Thali - 170");
		System.out.println("3.rajsthani Thali - 200");
		System.out.println("Which thali do you want:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enter Quantity");
		int quantity=sc.nextInt();
		switch(num)
		{
		case 1: System.out.println("bill:"+(150*quantity));
		break;
		case 2: System.out.println("bill:"+(170*quantity));
		break;
		case 3: System.out.println("bill:"+(200*quantity));
		break;
		default: System.out.println("invalid");
		}
	}

}
