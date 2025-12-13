import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the speed:");
	    int a=sc.nextInt();
	    if( a>100)
	    System.out.println("Over Speeding-fine imposed!");
	    else
	    System.out.println("Speed is within the limit.");
	}
}
