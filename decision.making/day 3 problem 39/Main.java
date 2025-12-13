import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        double num1=sc.nextDouble();
        System.out.println("Enter the num2:");
        double num2=sc.nextDouble();
        System.out.println("Enter any operator'+','-','*','/','%':");
        char ch=sc.next().charAt(0);
        double output;
        switch(ch)
        {
            case '+':
                output=num1+num2;
                System.out.println(output);
                break;
            case '-':
                output=num1-num2;
                System.out.println(output);
                break;
            case '*':
                output=num1*num2;
                System.out.println(output);
                break;
            case '/':
                if(num2!=0){
                output=num1/num2;
                System.out.println(output);}
                else{
                System.out.println("Error : divisible by zero");}
                break;
            case '%':
                if(num2!=0){
                output=num1%num2;
                System.out.println(output);}
                else{
                System.out.println("Error:division by zero");}
                break;
                default:
                System.out.println("invalid operator please enter +,-,/,*,%");
        }
    }
}