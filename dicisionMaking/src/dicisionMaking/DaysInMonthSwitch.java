package dicisionMaking;

import java.util.Scanner;

public class DaysInMonthSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter month:");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 st days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:	
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28 days");
			break;
			default:System.out.println("invalid month");
			sc.close();
		}
	}

}
