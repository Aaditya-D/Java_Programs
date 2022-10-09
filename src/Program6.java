public class Program6 {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabyte = kiloBytes / 1024;
            int remainingkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megabyte + "MB and " + remainingkilobytes + "KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(50000);
    }
}
