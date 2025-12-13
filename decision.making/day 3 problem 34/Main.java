import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		if((a%4==0) && (a%100!=0))
		System.out.println("it's leap year");
		else  
		System.out.println("it's not leap year");
		
	}
}
