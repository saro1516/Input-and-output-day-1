import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your purchsed amount");
	    int a=sc.nextInt();
	    double b=a-(a*0.5);
	    double c=a-(a*0.10);
	    if(a>=100 && a<=1000)
	    System.out.println("no discount:"+a);
	    else if(a>1000 && a<3000)
		System.out.println("you have to pay:");
		else if(a>3000 && a<5000)
		System.out.println("you have to pay:");
		else if(a>5000)
		System.out.println("you have to pay:");
		else
		System.out.println("invslid purchase");
	}
}
