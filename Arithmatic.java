import java.util.Scanner;

public class Arithmatic {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Your First Number:");
        int First = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int Second = input.nextInt();

        int add = First + Second;
        int Sub = First - Second;
        int mul = First *Second;
        int div = First / Second;


        System.out.println("Addition is:" + add);
        System.out.println("Subtraction:" + Sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division:" + div);



    }
        
}

    

