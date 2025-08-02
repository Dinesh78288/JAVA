
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Welcome To our Calculator");
        System.out.print("Enter YOur First Number: ");
        int firstNum = input.nextInt();
        System.out.print(" Enter Your Second Numbum: ");
        int secondNum = input.nextInt();
        int Sum = firstNum + secondNum;
        System.out.println("Sum of your number is: " + Sum);
    }
}
