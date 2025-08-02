import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Jay Shri Hanuman " + name);
        System.out.print(name + " Also tell me age: ");
        int age = input.nextInt();
        System.out.println("your age is " + age );

    }
}
    

