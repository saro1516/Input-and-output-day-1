import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char ch=sc.next().charAt(0);
	    char uh=sc.next().charAt(0);
	    if(ch==uh)
	    System.out.println("it is equal ");
	    else
	    System.out.println("it is not equal");
}
}