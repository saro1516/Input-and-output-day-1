import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a<10 && a>0 || a<0 && a>-10)
	     System.out.println(a+":is single digit");
	    else if(a>9 && a<100 || a>-100 && a<-9)
	     System.out.println(a+": double digit");
	     else if(a>99 && a<1000 || a>-1000 && a<-99)
	     System.out.println(a+": three digit");
	
	}
}
