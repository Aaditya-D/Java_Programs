public class Program3 {
    
    public static long milesPerHour(double kilometerPerHour){
        if(kilometerPerHour < 0){
            return -1;
        }

        return Math.round(kilometerPerHour / 1.609);
    }

    public static void printConversion(double kilometerPerHour){
        if(kilometerPerHour < 0){
            System.out.println("Invalid Parameter");;
        }else{
            long milesPerHour = milesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(60.8);
    }

}
