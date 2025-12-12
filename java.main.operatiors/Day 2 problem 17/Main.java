import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a>0 && (a&(a-1))==0)
		System.out.println("number is power of 2");
		else
		System.out.println("number is not power of 2");
	}
}
