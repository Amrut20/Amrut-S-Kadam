import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator calc = new Calculator(a,b);
        double res = calc.operate(op);
        System.out.println("Result: " + res);

        sc.close();
    } 
}    
class Calculator {
    double a, b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double operate(String oper) {
        switch (oper.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Division by zero error");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation");
                return Double.NaN;
        }
    }
}


 