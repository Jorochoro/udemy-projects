import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers (int size) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void printArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers (int[] array) {
//        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[largestIndex]) {
                    largestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[largestIndex];
            array[largestIndex] = temp;
//            sortedArray[i] = largestNumber;
        }
        return array;
//        return sortedArray;
    }
}
