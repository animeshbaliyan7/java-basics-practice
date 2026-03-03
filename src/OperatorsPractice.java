import java.util.Scanner;

public class OperatorsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic operator
        System.out.println("--- ARITHMETIC OPERATORS ---");
        System.out.println("Addition: "+(a+b));
        System.out.println("Addition: "+(a-b));
        System.out.println("Addition: "+(a*b));

        if(b!=0){
            System.out.println("Division: "+(a/b));
            System.out.println("Modulus: "+(a%b));
        }
        else
            System.out.println("Division & Modulus is not possible if second number is zero.");

        // RELATIONAL OPERATOR
        System.out.println("--- RELATIONAL OPERATOR ---");
        System.out.println("a > b" +(a > b));
        System.out.println("a == b" +(a == b));
        System.out.println("a != b" +(a != b));

        // LOGICAL OPERATORS
        System.out.println("--- LOGICAL OPERATORS ---");
        boolean bothPositive = (a > 0 && b > 0);
        System.out.println("Both numbers positive: " +bothPositive);

        // TERNARY OPERATOR
        System.out.println("--- TERNARY OPERATOR ---");
        String evenOdd = (a % 2 == 0) ? "First number is even" : "First number is Odd";
        System.out.println("Ternary check: "+evenOdd);
    }


}
