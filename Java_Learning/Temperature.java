public class Temperature{
    public static void main(String args[]){
       int c=12;
double f=(c*9/5)+32;
System.out.println("Temperature in Fahrenheit"+f);
double c1=(f-32)*5/9;
System.out.println("Temperature in Celsius"+c1);
double K;
K=c+273.15;
K=c1+273.15;
System.out.println("Temperature in Kelvin"+c);
System.out.println("Temperature in Kelvin"+c1);
    }
}