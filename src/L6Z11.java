/*
        Вводим название города.
        Написать, кончается ли данная строка строкой "burg".
 */

import java.util.Scanner;

public class L6Z11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city;

        System.out.print("Введите название города: ");
        city = scanner.next();
        System.out.println();

        int i = city.indexOf("burg", (city.length()-4));
        System.out.println((i!=-1) ? ("Кончается") : ("Не кончается"));

    }
}
