import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your balace data");
	    int a=sc.nextInt();
	    
	    if( a>700 && a<=1000)
	    System.out.println("1gb remains:"+a);
	    else if(a>=300 & a<=700)
	    System.out.println("50% data alert!:"+a);
	    else if(a<300)
	    System.out.println("low data alert!:"+a);
	    else
	    System.out.println("invalid data");
	}
}
