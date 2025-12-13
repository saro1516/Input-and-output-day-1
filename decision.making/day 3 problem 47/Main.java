import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your battery percentage");
	    int a=sc.nextInt();
	    if(a>1 && a<30)
	    System.out.println("Low battery:"+a);
	    else if(a>29 && a<51)
		System.out.println("50% javaonsummed");
		else if(a>50 && a<101)
		System.out.println("100% full charged");
		else
		System.out.print("invalid charge number");
		
	}
}
