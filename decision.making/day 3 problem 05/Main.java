import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>99 && a<999)
        System.out.println(a+":it is a three digit number");
        else
        System.out.println(a+":it is not a three digit number");
    }
}