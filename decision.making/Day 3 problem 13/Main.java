import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a>0)
	     System.out.println(a+": Positive");
	     else if(a<0)
	     System.out.println(a+": Negative");
	     else
	     System.out.println(a+":Zero");
	}
}
