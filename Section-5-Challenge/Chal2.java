public class Chal2 {
    public static void main(String[] args) {
        int test1 = 2500;
        int test2 = -1024;
        int test3 = 5000;

        printMegaBytesAndKiloBytes(test1);
        printMegaBytesAndKiloBytes(test2);
        printMegaBytesAndKiloBytes(test3);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " 
            + megaBytes + " MB and " +
             remainingKB + " KB");
        }
    }
}