package dicisionMaking;

import java.util.Scanner;

public class LesserNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter 4 numbers");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		if(a<b && a<c && a<d)
			System.out.println("a is lesser" +a);
		else if(b<a && b<c && b<d)
			System.out.println("bi lesser" +b);
		else if(c<a && c<b && c<d)
			System.out.println("c is lesser:" +c);
		else
			System.out.println("d is lesser:" +d);
		input.close();
	}

}
