import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if(a==b && b==c &&  c==a)
	    System.out.println("the triangle is equilateral");
	    else if(a==b && b==a && c!=a || a==c && b!=a && c==a || a!=c && b==c && c==b)
	    System.out.println(" the triangle is isosceles");
	    else
	    System.out.println("the triangle is scalene");;
}
}