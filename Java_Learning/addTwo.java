import java.util.Scanner;
class addTwo{
    public static void main(String[]args){
        Scanner num= new Scanner(System.in);
            System.out.println("Eneter the first value");
            int num1=num.nextInt();
            System.out.println("enter the second value:");
            int num2=num.nextInt();
            System.out.println(num1);
            System.out.println(num2);
            int sum=num1+num2;
             System.out.println(sum);
             System.out.println(num1-num2);
        }
    }