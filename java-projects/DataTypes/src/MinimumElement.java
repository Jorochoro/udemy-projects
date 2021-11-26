import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static int[] readElements(int a) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
        }
        return min;
    }
}
