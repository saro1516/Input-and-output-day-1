import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your age?");
	    int a=sc.nextInt();
	    if(a>=18)
	    System.out.println("eligible for vote:"+a);
	    else
		System.out.println("not eligible");
	}
}
