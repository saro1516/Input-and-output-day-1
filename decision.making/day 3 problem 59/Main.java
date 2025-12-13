import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the day:");
	    String a=sc.nextLine();
	    if(a.equals("weekday"))
	    System.out.println("ticket price 500");
	    else if(a.equals("weekend"))
	   System.out.println("ticket price 700");
	   else
	   System.out.println("invalid day");
	                               
	}
}
