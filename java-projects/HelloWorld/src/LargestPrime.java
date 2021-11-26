public class LargestPrime {
    public static int getLargestPrime ( int number ) {

        if (number <= 1) return -1;

        int fact = 2;
        int largestPrime = -1;

        while (number > 1) {
            if (number % fact == 0) {
                if (number == fact) {
                    largestPrime = number;
                    number /= fact;
                } else {
                    number /= fact;
                    largestPrime = number;
                    fact = 1;
                }
            }
            fact++;
        }
        return largestPrime;
    }
}
