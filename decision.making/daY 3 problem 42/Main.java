import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        switch(month) {
            case 1: 
            case 2: 
            case 3: 
                System.out.println("Summer");
                break;
            case 4: 
            case 5:
            case 6:
                System.out.println("spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Autumn");
            case 10:
            case 11:
            case 12:
                
                System.out.println("Winter");
            default:
                System.out.println("Invalid month. Please enter 1-12.");
        }
    }
}
