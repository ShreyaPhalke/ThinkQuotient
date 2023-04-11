package dicisionMaking;

import java.util.Scanner;

public class IfElseIfAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choise:");
		Scanner sc = new Scanner(System.in);
		char h= sc.next().charAt(0);
		char ch = sc.next().charAt(0);
		char c = sc.next().charAt(0);
		if (h>='0' && h<='9')
			System.out.println("it is a number");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("it is alphabate");
		else if (c=='@' || c=='#' || c=='$' || c=='&')
		 System.out.println("special symbol");
		else
			System.out.println("invalid");
		sc.close();
	}

}
