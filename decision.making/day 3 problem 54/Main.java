import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter temp:");
	    int a=sc.nextInt();
	    if(a>=0 && a<=20)
	    System.out.println("cold:"+a);
	    else if(a>=20 && a<=35)
		System.out.println("pleasent:"+a);
		else if(a>35 && a<=50)
		System.out.println("hot:"+a);
		else if(a>50)
		System.out.println("heatwave:"+a);
		else
		System.out.println("invslid temprature!");
	}
}
