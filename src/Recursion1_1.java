import java.util.Scanner;

public class Recursion1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите n = ");
        int n = s.nextInt();

        if(n<0){
            System.out.println("Число отрицательное!");
        }
        else if(n>0){
            System.out.print("Сумма первых n слагаемых = " + sumNum(n));
        }


    }
    public static int sumNum(int n){

        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum+=i;
        }
        return sum;
    }
}
