/*
        Ввести строку, а за ней два числа.
        Вывести ту часть строки, которая попадает под границы введёных символов
 */

import java.util.Scanner;

public class L6Z12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int a, b;

        System.out.print("Введите строку: ");
        str = scanner.nextLine();
        System.out.println();

        System.out.print("Введите числа: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a <= (str.length() - 1) || (b <= str.length())) {
            System.out.println("Результат: " + str.substring(a, b));
        } else {
            System.out.println("Выход за границы.");
        }
    }
}
