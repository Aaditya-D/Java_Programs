public class Program5 {

    public static String getDuration(long minutes, long seconds) {
        if (seconds < 0 || minutes < 0 || seconds > 59) {
            return "Invalid Parameters";
        }

        long hours = minutes / 60;
        long remainingminutes = minutes % 60;
        return hours + "h " + remainingminutes + "m " + seconds + "s";
    }

    public static String getDuration(long seconds) {
        if (seconds < 0) {
            return "Invalid parameter";
        }

        long minutes = seconds / 60;
        long remainingseconds = seconds % 60;

        return getDuration(minutes, remainingseconds);
    }

    public static void main(String[] args) {
        // System.out.println(getDuration(150, 20));
        System.out.println(getDuration(5211));
    }
}
