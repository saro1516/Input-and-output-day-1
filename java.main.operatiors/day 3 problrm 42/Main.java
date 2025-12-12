import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int c=sc.nextInt();
	    int st=sc.nextInt();
	    int di=c/st;
	    int re=c-(st*di);
		System.out.println("candies:"+c);
			System.out.println("no of student:"+st);
				System.out.println("each student get:"+di);
			System.out.println("Remainig:"+re);
		
			
		
		
	}
}