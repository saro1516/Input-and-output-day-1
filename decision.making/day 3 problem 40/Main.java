import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Error: invalid mark, please enter mark under 100");
            return; 
        }
        int gradeCategory = marks / 10; 
        switch (gradeCategory) {
            case 10:
            case 9:  
            case 8:  
                System.out.println("Grade: A");
                break;
            case 7:  
            case 6:  
            case 5:  
                System.out.println("Grade: B");
                break;
            case 4:  
            case 3:  
                System.out.println("Grade: C");
                break;
            case 2:  
            case 1:  
            case 0: 
                System.out.println("Fail");
                break;
        }
    }
}
