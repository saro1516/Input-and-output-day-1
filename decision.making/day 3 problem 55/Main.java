import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter battery percentage:");
	    int a=sc.nextInt();
	    if(a>=0 && a<=20)
	    System.out.println("low battery:"+a);
	    else if(a>=20 && a<=60)
		System.out.println("moderate battery:"+a);
		else if(a>60 && a<=100)
		System.out.println("Full:"+a);
		else
		System.out.println("invslid battery percentage!");
	}
}
