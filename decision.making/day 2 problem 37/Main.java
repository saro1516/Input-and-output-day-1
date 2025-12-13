import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=a%10;
	    int d=b%10;
	    System.out.println(c);
	    System.out.println(d);
	    if(c==d)
		System.out.println(c+"last two digit of year are same:");
	else  
		System.out.println(d+"last two digit are not same");
		
	}
}
