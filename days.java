import java.util.Scanner;

public class days {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Days");

        System.out.println("Enter your Choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your choice is 1");
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Your choice is 2");
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Your choice is 3");
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Your choice is 4");
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Your choice is 5");
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Your choice is 6");
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Your choice is 7");
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Your choice is wrong");
        }
    }
}
