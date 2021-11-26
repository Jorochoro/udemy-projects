public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor( int first, int second ){
        if ( first < 10 || second < 10 ) return -1;
        int counter = first > second ? first : second;
        while ( counter > 0 ) {
            if ( first % counter == 0 && second % counter == 0) return counter;
            counter--;
        }
        return -1;
    }
}
