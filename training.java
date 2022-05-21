import java.util.Scanner;

public class training {
    public static void main (String[] args) {
        // Training for user input
        System.out.println("Define login ");
        Scanner sc = new Scanner(System.in);
        String Login = sc.nextLine();
        System.out.println("Type login ");
        Scanner type = new Scanner(System.in);
        String typedLog = type.nextLine();
        if (typedLog.equals(Login)) {
            System.out.println("Access gained");
        }
        else {
            System.out.println("Access denied");
        }
        //System.out.println("Type your name ");
        //String name = sc.next();
        //System.out.println("Type your surname ");
        //String age = sc.next();
        //System.out.println("Hello " + name + " " + age);
    }
}

