/*
        Введите число.
        Заполните массив степенями данного числа вплоть до 5.
 */

import java.util.Arrays;
import java.util.Scanner;

public class L6Z18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num;
        int [] arr = new int[5];

        for (int i = 0; i < 5; i++){
            arr[i] = num;
            num *=a;
        }

        System.out.println(Arrays.toString(arr));
    }
}
