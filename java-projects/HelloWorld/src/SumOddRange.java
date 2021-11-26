public class SumOddRange {
    public static boolean isOdd( int number ){
        if (number > 0 && number % 2 != 0) return true;
        return false;
    }

    public static int sumOdd( int start, int end ){
        if(end < start || (start < 0 || end < 0)) return -1;
        int sum = 0;
        for(int i = start; i < end + 1; i++){
            sum = isOdd(i) ? sum + i : sum;
        }
        return sum;
    }
}