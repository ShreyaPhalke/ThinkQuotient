package dicisionMaking;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,d,e;
float avg;
System.out.println("enter marks of 5 subjects");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
avg=(a+b+c+d+e)/5;
System.out.println("average of 5 numbers is:"+avg);
if(avg>=90 && avg<=100)
	System.out.println("A+ grade");
else if(avg>=60 && avg<=89)
	System.out.println("A grade");
else if(avg>=50 && avg<=59)
	System.out.println("b grade");
else if(avg>=35 && avg<=49)
	System.out.println("c grade");
else
	System.out.println("fail");
sc.close();
	}

}
