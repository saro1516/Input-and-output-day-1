import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your temp");
	    int a=sc.nextInt();
	    if(a>=100)
	    System.out.println("fever is high"+a);
	    else
		System.out.println("no fever");
	}
}
