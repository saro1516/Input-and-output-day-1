import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int am=sc.nextInt();
		int t=(am/2000);
		int t2=(am%2000);
		int f=(t2/500);
		int f2=(t2%500);
		int h=(f2/100);
		int h2=(h%100);
		System.out.println("2000 notes:"+t);
			System.out.println("500 notes:"+f);
				System.out.println("100 notes:"+h);
	}
}
