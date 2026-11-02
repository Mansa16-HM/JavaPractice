public class conn{
    public static void main(String[]args){
        int i = 0;
while(i < 5) {
    i++;
    if(i == 3) {
        continue;
    }
    System.out.println(i);
}
int num = 1;
while(num <= 10) {
    if(num == 5) {
        break;
    }
    System.out.println(num);
    num++;
}
    }
}
