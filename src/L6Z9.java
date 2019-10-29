/*
        Вводим строку.
        Напишите программу, которая меняет все вхождения символа 'a' на 'b'.
 */

import java.util.Scanner;

public class L6Z9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;

        System.out.print("Введите строку: ");
        str = scanner.nextLine();
        System.out.println();

        System.out.println("Изменённая строка: "+ str.replace('a', 'b'));

    }
}
