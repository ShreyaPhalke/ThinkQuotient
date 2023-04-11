package dicisionMaking;

import java.util.Scanner;

public class AnimalsOfCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter country name:");
		String animal = sc.nextLine();
		animal = animal.toUpperCase();
		switch (animal) {
		case "INDIA":
			System.out.println("tiger");
			break;
		case "AUSTRALIA":
			System.out.println("kangaroo");
			break;
		case "SRI LANKA":
			System.out.println("lion");
			break;
		default:
			System.out.println("enter valid country name");
			break;
		}
	}

}
