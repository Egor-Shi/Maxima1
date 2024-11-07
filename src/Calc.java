import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        double a, b;
        char c;
        System.out.println("Введите числа а и b : ");

        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.println("Введите матетматичесаий знак :");
        c = s.next().charAt(0);

        switch (c) {
            case '/':
                double sum = a / b;
                System.out.println(sum);
                break;
            case '-':
                sum = a - b;
                System.out.println(sum);
                break;
            case '+':
                sum = a + b;
                System.out.println(sum);
                break;
            case '*':
                sum = a * b;
                System.out.println(sum);
                break;
            default:
                System.out.println("Неизвестно");

        }


    }

}

