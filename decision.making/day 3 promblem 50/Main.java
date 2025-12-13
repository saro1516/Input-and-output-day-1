import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your unit?");
	    int a=sc.nextInt();
	    int b=a*5;
	    int c=a*10;
	    if(a>=0 && a<=100)
	    System.out.println("no current bill:"+a);
	    else if(a>100 && a<300)
		System.out.println("you have to pay:"+b);
		else if(a>300 && a<500)
		System.out.println("you have to pay:"+c);
		else if(a>500)
		System.out.println("you have to pay:"+c+1000);
		else
		System.out.println("invslid unit");
	}
}
