import java.util.Scanner;

public class Recursion2_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = s.nextInt();
        if(n<0){
            System.out.println("Число отрицательное!");
        }
        else if(n>=0){
            System.out.print("Факториал " + n + "! = " + multyNum1(n));
        }}
    public static int multyNum1(int n){
        if(n==0){
            return 1;
        }
        return n * multyNum1(n - 1);
    }
}
