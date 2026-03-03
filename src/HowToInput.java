import java.util.Scanner;

public class HowToInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();  // integer input

        System.out.print("Enter second number: ");
        int b = sc.nextInt();  // integer input

        int c = a+b;
        System.out.println("Addition of these numbers are: " +c);
    }
}
