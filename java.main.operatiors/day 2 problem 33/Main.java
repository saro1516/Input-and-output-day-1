import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double l=sc.nextDouble();
	    double w=sc.nextDouble(); 
	    double h=sc.nextDouble(); 
	    
	      double sa=2*((l*w)+(l*h)+(w*h));
	      double v=l*w*h;
	      
		System.out.println("surface area:"+sa);
		System.out.println("Volume:"+v);
	}
}
