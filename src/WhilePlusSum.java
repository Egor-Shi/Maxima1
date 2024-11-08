import java.util.Scanner;

public class WhilePlusSum {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int sum = 0;
        int i;
        System.out.println("Введите числа больше 0 : ");
        while (true) {
            i = a.nextInt();
            if (i < 0) {
                break;
            }
            sum = sum + i;
        }
        System.out.println("Сумма : " + sum);


    }
}
