import java.util.Scanner;

public class Recursion2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = s.nextInt();
        if(n<0){
            System.out.println("Число отрицательное!");
        }
        else if(n>0){
            System.out.print("Произведение первых n чисел = " + multyNum(n));
        }


    }
    public static int multyNum(int n){

        int multy = 1;
        for (int i = 1; i <= n ; i++) {
            multy*=i;
        }
        return multy;
    }
}
