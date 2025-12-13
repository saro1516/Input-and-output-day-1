import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your age?");
	    int a=sc.nextInt();
	    if(a>=60)
	    System.out.println("You are eligible for senior citizen benefits:"+a);
	    else
		System.out.println("not eligible");
	}
}
