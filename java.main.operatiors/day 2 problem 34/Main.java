import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double l=sc.nextDouble();
	    
	      double sa=4*Math.PI*Math.pow(l,2);
	      double v=(4.0/3.0)*Math.PI*Math.pow(l,3);
	      
		System.out.println("surface area:"+sa);
		System.out.println("Volume:"+v);
	}
}
