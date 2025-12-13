import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the cell num:");
	    String a=sc.nextLine();
	    if(a.length()==10 )
	    System.out.println("Valid cell number!");
	    else
	    System.out.println("invalid number.");
	}
}
