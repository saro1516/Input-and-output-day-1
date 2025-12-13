import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your score?");
	    int a=sc.nextInt();
	    if(a>=35)
	    System.out.println("You passed the exam:"+a);
	    else
		System.out.println("fail-better luck next time!!:"+a);
	}
}
