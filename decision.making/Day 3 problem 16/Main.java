import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if( a%5==0 && a%3==0 && a%8!=0)
	     System.out.println(a+":is divisible by 5,3 and not divisible by 8");
	    else
	     System.out.println(a+":is not divisible by 5,3 and divisible by 8");
	}
}
