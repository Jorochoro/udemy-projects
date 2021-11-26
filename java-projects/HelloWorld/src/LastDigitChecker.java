public class LastDigitChecker {
    public static boolean hasSameLastDigit ( int a, int b, int c){
        if ( !isValid(a) || !isValid(b) || !isValid(c)) return false;
        if ( a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) return true;
        return false;
    }

    public static boolean isValid ( int a ) {
        if ( a < 10 || a > 1000) return false;
        return true;
    }
}
