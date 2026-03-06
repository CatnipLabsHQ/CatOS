import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result;

        System.out.println("please enter the first number");
        int num1 = input.nextInt();

        System.out.println("Pleas enter the one of the following Operetor +, -, *, /,");
        String oper = input.next();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();

        if (oper.equals("+")) {
            result = num1 + num2;
            System.out.println("The Result is: " + result );
        }
        if (oper.equals("-")) {
            result = num1 - num2;
            System.out.println("The Result is: " + result );
        }
        if (oper.equals("*")) {
            result = num1 * num2;
            System.out.println("The Result is: " + result );
        }
        if (oper.equals("/")) {
            result = num1 / num2;
            System.out.println("The Result is: " + result );
        }






    }
}
