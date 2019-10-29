/*
        Даны две строки.
        Сравнить их игнорируя все пробелы в каждой из них.
        Вывести true или false.
 */

import java.util.Scanner;

public class L6Z13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String new_str1 = str1.replaceAll(" ", "");
        String new_str2 = str2.replaceAll(" ", "");


        System.out.println(new_str1.equals(new_str2));
    }
}
