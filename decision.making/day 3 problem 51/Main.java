import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter amount");
	    int bl=2000;
	    int a=sc.nextInt();
	    if(a<=bl && a100==0)
	    System.out.println("your withdrawel succsessfull"+a);
	    else 
		System.out.println("insufficient balance");
	}
}
