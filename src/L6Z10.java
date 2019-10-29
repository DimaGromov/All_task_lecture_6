/*
        Дана строка.
        Проверить, начинатеся ли она с буквы А, игнорируя регистр.
 */

import java.util.Scanner;

public class L6Z10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;

        System.out.print("Введите строку: ");
        str = scanner.nextLine();
        System.out.println();

        System.out.println((str.charAt(0) == 'A' || str.charAt(0) == 'a') ? ("Строка начинается с 'A' или 'a'") : ("Строка не начинается с 'A' или 'a'"));
    }
}
