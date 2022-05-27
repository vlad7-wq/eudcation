import java.util.Scanner;

public class Home_Work2 {
    public static void main (String[] args) {
            // Define first number
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
            // Define a sign
        System.out.println("Enter a sign: ");
        Scanner sc3 = new Scanner(System.in);
        String sign = sc3.nextLine();
            // If user enter percentage sign, then he needs to define percentage number
        if (sign.equals("%")) {
            System.out.println("Enter a percentage number: ");
        }   // Otherwise, user needs to define a second number
            else {
            System.out.println("Enter a number2: ");
        }
        Scanner sc2 = new Scanner(System.in);
        double num2 = sc2.nextDouble();
            // Here we calculate percentage result
        if (sign.equals("%")) {
            double per = (num1 / 100) * num2;
            System.out.println("Result: " + per);
        }  // Here we calculate other results
        if (sign.equals("+")) {
            System.out.println("Result: " + num1 + num2);
        }
        if (sign.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        }
        if (sign.equals("*")) {
            System.out.println("Result: " + num1 * num2);
        }
        if (sign.equals("/")) {
            System.out.println("Result: " + num1 / num2);
        }
    }
}
