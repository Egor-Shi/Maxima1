import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {

        int [] arr = new int[4];
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 4 числа : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}