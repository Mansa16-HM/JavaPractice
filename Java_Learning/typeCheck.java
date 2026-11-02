public class typeCheck{
    public static void main(String[] args){
        int a=10;
       float b=60.9f;
        byte c=100;
        double f=12.0008767;
        boolean T=true;
        long e=200000;
        char g='A';
        short S=11;
       System.out.println("Interger Value:"+a);
       System.out.println("Floating Value:"+b);
       System.out.println("Byte Value:"+c);
       System.out.println("Double value"+f);
       System.out.println("Boolean Value:"+T);
       System.out.println("Short value:"+S);
       System.out.println("Character value:"+g);
       System.out.println("Long value:"+e);
       Object M= true;
       System.out.println(M.getClass().getSimpleName());
        Object X= 200.90f;
       System.out.println(X.getClass().getSimpleName());
        Object L= 1;
       System.out.println(L.getClass().getSimpleName());
    } 
}