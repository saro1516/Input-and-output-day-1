import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance=1000;
        System.out.println("1.check balance");
        System.out.println("2.deposite money");
        System.out.println("3.withdraw money ");
        System.out.println("4.exit");
        System.out.println("what you want:");
        int choice=sc.nextInt();
        if(choice>=1 && choice<=4)
        switch(choice){
            case 1:
                System.out.println(balance);
                break;
            case 2:
                System.out.println("enter amount");
                int deposite=sc.nextInt();
                if(deposite!=0){
                balance+=deposite;
                System.out.println("Amount deposited successfully");
                    
                }
                else{
                    System.out.println("Error:Invalid deposite amount");
                    break;}
                case 3:
                    System.out.println("Enter amount");
                    int with=sc.nextInt();
                    if(with!=0 && with<balance){
                    balance-=with;
                    System.out.println("withdrawel successfully");
                    }
                    else{
                        System.out.println("invalid  amount");
                    break;}
                    case 4:
                        System.out.println("Thankyou for using ATM");
                
        }
        
    }
}