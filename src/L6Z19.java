/*
        Найти максимальный и минимальный элемент в массиве.
 */

import java.util.Arrays;
import java.util.Random;

public class L6Z19 {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int[] arr = new int[50];

        for (int i = 0; i < 50; i++) {
            arr[i] = random.nextInt(1000);
        }

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i <= min) {
                min = i;
            }
            if (max <= i) {
                max = i;
            }
        }


        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное: " + min + ". Максимальное: " + max + ".");
    }
}
