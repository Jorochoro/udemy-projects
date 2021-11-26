import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        for( int i = 0; i < 1000; i++){
            System.out.print("Number: " + i + " ");
            System.out.println(LargestPrime.getLargestPrime(i));
        }
    }
}
