import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int passKey = 1234;

        System.out.print("Enter pass Key: ");
        int userInput = Input.nextInt();

        if(passKey == userInput){
            System.out.println("You are logged in");
        }
        else{
            System.out.println("Please try again your pass Key is incorrect.");
        }

        Input.close();

    }
}
