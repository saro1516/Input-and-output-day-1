import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double x1=sc.nextDouble();
        double y=sc.nextDouble();
        double y1=sc.nextDouble();
        double c=Math.sqrt((x-y)*(x-y)+(x1-y1)*(x1-y1));
        System.out.println(c);
    }
}
