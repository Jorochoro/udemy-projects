public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mb = kiloBytes / 1024;
        int remKb = kiloBytes % 1024;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kiloBytes + " KB = " + mb + " MB and " + remKb + " KB");
    }
}
