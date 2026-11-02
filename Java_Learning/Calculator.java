import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        
        double result = 0;
        boolean validOperator = true;
        
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    validOperator = false;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator!");
                validOperator = false;
        }
        
        if(validOperator) {
            System.out.println("Result: " + result);
        }
    }
}
//case may be yes or No,A ,special symbol Menu based website n all
// switch and if else id works for same 
