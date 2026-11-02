import java.util.Scanner;
class EvenOrOdd{
    public static void main(String[]args){
        Scanner O=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=O.nextInt();
        if(a%2==0){
            System.out.println("Even:"+a);
        }
        else{
            System.out.println(a+ "Odd" +a);
        }
    }
}