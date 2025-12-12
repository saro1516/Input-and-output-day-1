import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double surface=sc.nextDouble(); 
	      double a=6*Math.pow(surface,2);
	      double b=Math.pow(surface,3);
	      double c=12*surface;
	    
		System.out.println("surface area:"+a);
		System.out.println("Volume:"+b);
		System.out.println("Perimeter:"+c);
	}
}
