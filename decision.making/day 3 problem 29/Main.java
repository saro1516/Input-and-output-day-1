import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
		if(a<=0 && a>=-5 && b>=0 && b<=5){
		System.out.println("third quadrant");
		}
		else if(a<=0 && a>=-5 && b<=0 && b>=-5){
		System.out.println("second quadrant");
		}
		else if(a>=0 && a<=5 && b<=0 && b>=-5){
		System.out.println("first quadrant");
		}
		else{
		System.out.println("fourth quadrant");
		}
		
	}
}
