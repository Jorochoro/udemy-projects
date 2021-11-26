public class NumberToWords {
    public static void numberToWords( int number ){
        if ( number < 0 ) System.out.println("Invalid Value");
        int reverse = reverse(number);
        int numDigits = getDigitCount(number);
        for( int i = 0; i < numDigits; i++ ){
            switch( reverse % 10 ){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverse /= 10;
        }
    }

    public static int reverse ( int number ){
        String numString = "";
        int num = Math.abs(number);
        int numDigits = getDigitCount(num);
        int count = 0;

        while ( count < numDigits ) {
            numString += (num % 10);
            num /= 10;
            count++;
        }
        return (number < 0) ? -1 * Integer.parseInt(numString) : Integer.parseInt(numString);
    }

    public static int getDigitCount( int number ){
        if ( number < 0 ) return -1;
        int size = 0;
        while ( number > 9 ) {
            size += 1;
            number /= 10;
        }
        size += 1;
        return size;
    }
}
