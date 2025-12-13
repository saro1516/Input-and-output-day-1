import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter light colour:");
	    String ch=sc.nextLine();
	    if(ch.equals("red"))
	    System.out.println("Stop:"+ch);
	    if(ch.equals("green"))
	    System.out.println("go:"+ch);
	    if(ch.equals("yellow"))
	    System.out.println("wait:"+ch);
	   else 
		System.out.println("invalid color");
	}
}
