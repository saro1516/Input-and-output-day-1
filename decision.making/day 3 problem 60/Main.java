import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=a*5;
	    int c=a*10;
	    if(a<=1000)
	    System.out.println("no bill:"+a);
	    else if(a>1000 & a<2000)
	    System.out.println("pay:"+b);
	    else if(a>2000)
	    System.out.println("pay:"+c);
	    else
	    System.out.println("invalid bill");
	}
}
