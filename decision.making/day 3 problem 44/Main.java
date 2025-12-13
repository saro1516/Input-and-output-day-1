import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	     double b=a-(a*0.15);
	     double c=a-(a*0.30);
	    if(a>0 && a<1001)
	    System.out.println("no dicount\n"+"pay:"+a);
	    else if(a>1000 && a<5001)
		System.out.println("your discounted price is 15% /n pay:"+b+"Only");
		else if(a>5000 && a<10001)
		System.out.println("your discounted price is 15% /n pay:"+c+"Only");
		else
		System.out.println("invalid purchase ,buy under  10000");
	}
}
