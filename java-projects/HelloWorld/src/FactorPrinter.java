public class FactorPrinter {
    public static void printFactors( int number) {
        if ( number < 1 ) System.out.println("Invalid Value");
        String factors = "";
        boolean firstPrint = true;

        for ( int i = 1; i <= number; i++ ){
            if ( number % i == 0 ){
                if( firstPrint ){
                    factors += i;
                    firstPrint = false;
                }
                else factors += " " + i;
            }
        }
        System.out.println(factors);
    }
}
