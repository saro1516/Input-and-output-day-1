import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double l=sc.nextDouble();
	    double h=sc.nextDouble();
	    
	      double sa=2*Math.PI*l*(l+h);
	      double v=Math.PI*Math.pow(l,2)*h;
	      
		System.out.println("surface area:"+sa);
		System.out.println("Volume:"+v);
	}
}
