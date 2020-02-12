import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.print("Задание 1: "); invertArray();
        System.out.println();
        System.out.print("Задание 2: "); fillArray();
        System.out.println();
        System.out.print("Задание 3: "); changeArray();
        System.out.println();
        System.out.println("Задание 4:"); fillDiagonal();
        System.out.println();
        System.out.print("Задание 5: "); table();
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = -3; i < arr.length; i++) {
            arr[i] = j += 3;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
            System.out.print(w[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0, g = arr[i].length; j < 5; j++, g--) {
                if (i == j || i == (g - 1))
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void table() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Максимальный элемент:" + max);
        System.out.print(" Минимальный элемент:" + min);
    }
}