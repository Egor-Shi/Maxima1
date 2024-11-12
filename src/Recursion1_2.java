import java.util.Scanner;

public class Recursion1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = s.nextInt();
if(n<0){
    System.out.println("Число отрицательное!");
}
else if(n>0){
        System.out.print("Сумма первых n слагаемых = " + sumNum1(n));
    }}
    public static int sumNum1(int n){
if(n<0){
    return 0;
}
        return n + sumNum1(n - 1);
    }
}
