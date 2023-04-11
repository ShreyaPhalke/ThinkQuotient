package dicisionMaking;

import java.util.Scanner;

public class FormulaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("which formula do you want to perform:");
		System.out.println("1.Area of circle"); //pi*r*r
		System.out.println("2.Area of Square");//s*s
		System.out.println("3.Area of Rectangle");//l*b
		System.out.println("4.Area of Right Angled Triangle");//(b*h)/2
		System.out.println("5.Circumference of Circle");//2*3.14*r
		System.out.println("6.Perimeter of Square");//s*4
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int area=sc.nextInt();
		switch(area)
		{
		case 1:
			float redius=sc.nextFloat();
			System.out.println("Area of circle is:"+(3.14*redius*redius));
		break;
		case 2:
			float side=sc.nextFloat();
			System.out.println("Area of Square is:"+(side*side));
		break;
		case 3:
			int lenght=sc.nextInt();
			int breadth=sc.nextInt();
			System.out.println("Area of Rectange is:"+(lenght*breadth));
		break;
		case 4:
			int base=sc.nextInt();
			int height=sc.nextInt();
			System.out.println("Area of Right Angled Triangle"+((base*height)/2));
		break;
		case 5:
			float r=sc.nextFloat();
			System.out.println("Circumference of circle is:"+(2*3.14*r));
		break;
		case 6:
			float s=sc.nextFloat();
			System.out.println("Perimeter of circle is:"+(s*4));
		break;
		}
	}

}
