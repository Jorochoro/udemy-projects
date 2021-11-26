import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countNums = 0;

        while (scanner.hasNextInt()){
            int nextInt = scanner.nextInt();
            sum += nextInt;
            countNums++;
        }
        System.out.println("SUM = " + sum + " AVG = " + (long) Math.round((double)sum/countNums));
    }
}
