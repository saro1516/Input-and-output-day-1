import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int price=sc.nextInt();
	    int discount=sc.nextInt();
	    int dis=price*discount/100;
	    int fin=price-dis;
		System.out.println("discount amout:"+dis);
		System.out.println("final amout:"+fin);
	}
}
