import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if(a>=30)
		System.out.println("Pass");
        else
		System.out.println("Fail");
		if(b>=30)
		System.out.println("Pass");
        else
		System.out.println("Fail");
		if(c>=30)
		System.out.println("Pass");
        else
		System.out.println("Fail");
	}
}