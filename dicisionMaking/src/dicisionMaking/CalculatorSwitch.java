package dicisionMaking;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int num1=sc.nextInt();
		System.out.println("enter number 2:");
		int num2=sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("which operation you want to perform:");
		int menu=sc.nextInt();
		switch(menu)
		{
			case 1:
				System.out.println("addition is:"+(num1+num2));
				break;
			case 2:
				System.out.println("substraction is:"+(num1-num2));
				break;
			case 3:
				if(num2==0) {
					System.out.println("divisor should not be zero please enter valid number");
					num2=sc.nextInt();
				System.out.println("division is:"+(num1/num2));
				}
				else
					System.out.println("division is:"+(num1/num2));
	
				break;
			case 4:
				System.out.println("multiplication is:"+(num1*num2));
				break;	
				default:System.out.println("enter valid option");
				break;
				}
	}

}
