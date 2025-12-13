import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the person(child,adult,senior):");
	    String ch=sc.nextLine();
	    if(ch.equals("child"))
	    System.out.println("ticket price 100:"+ch);
	    if(ch.equals("adult"))
	    System.out.println("ticket price 500:"+ch);
	    if(ch.equals("senior"))
	    System.out.println("ticket price 1000:"+ch);
	   else 
		System.out.println();
	}
}
