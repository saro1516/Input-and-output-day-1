import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		if(a%100==0)
		System.out.println("it's century year");
		else  
		System.out.println("it's not century year");
		
	}
}
