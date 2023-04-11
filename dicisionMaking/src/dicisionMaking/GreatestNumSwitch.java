package dicisionMaking;

import java.util.Scanner;

public class GreatestNumSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number1");
		int a = sc.nextInt();
		System.out.println("enter the number2");
		int b = sc.nextInt();
		int num=sc.nextInt();
		switch (num) 
		{
		case 1:
		{
			if(a>b)
			{
			System.out.println("a is greater");
			}
			else
			{
			System.out.println("b is greater");
			}
		}
			break;
		/*case 2:
			System.out.println("b is greater" + b);
			break;*/
		default:
			System.out.println("invalid");
		}
	}

}
