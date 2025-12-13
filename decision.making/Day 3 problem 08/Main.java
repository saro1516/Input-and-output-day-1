import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=a%10;
	    if(b%3==0)
	     System.out.println(b+":the number is divisible by 3");
	     else
	     System.out.println(b+":this number is not divisible by 3");
	}
}
