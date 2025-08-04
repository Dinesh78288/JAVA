import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator");
        System.out.println("Please Enter 4 all Sides: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double Perimeter = a + b + c + d ;
        System.out.println("Perimeter of your ractangle " + Perimeter +"CM");
    }
    
}
