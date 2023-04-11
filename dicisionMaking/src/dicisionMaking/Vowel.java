package dicisionMaking;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
char ch=sc.next().charAt(0);
if(ch=='a' || ch=='A' )
	System.out.println("character is vowel");
else if(ch=='e' || ch=='E' )
	System.out.println("character is vowel");
else if(ch=='i' || ch=='I' )
	System.out.println("character is vowel");
else if(ch=='o' || ch=='O' )
	System.out.println("character is vowel");
else if(ch=='u' || ch=='U' )
	System.out.println("character is vowel");
else
	System.out.println("character its consonants");
	}
}
