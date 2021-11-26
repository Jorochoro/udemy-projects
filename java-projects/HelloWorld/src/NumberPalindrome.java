public class NumberPalindrome {
    public static boolean isPalindrome( int number ) {
        String reverse = "";
        int num = number;
        while (num > 9) {
            reverse += (num % 10);
            num /= 10;
        }
        reverse += num;

        return number == Integer.parseInt(reverse) ? true : false;
    }
}
