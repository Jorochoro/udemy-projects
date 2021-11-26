public class ReverseArray {
    private static void reverse (int[] arr) {
        int temp;

        System.out.print("Array = [");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.println(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ", ");
        }


        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - (1+i)];
            arr[arr.length - (1+i)] = temp;
        }

        System.out.print("Reversed Array = [");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.println(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
