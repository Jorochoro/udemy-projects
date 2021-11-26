public class PerfectNumber {
    public static boolean isPerfectNumber ( int number ){
        if ( number < 1 ) return false;
        int counter = 1;
        int sum = 0;
        while ( counter <= number/2 ) {
            if ( number % counter == 0 ) sum += counter;
            counter++;
        }
        return sum == number ? true : false;
    }
}
