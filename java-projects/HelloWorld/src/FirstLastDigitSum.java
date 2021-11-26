public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit( int number ) {
        if ( number < 0 ) return -1;

        int lastDigit = number % 10;
        int firstDigit = lastDigit;

        while ( number >= 10 ) {
            firstDigit = number/10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
