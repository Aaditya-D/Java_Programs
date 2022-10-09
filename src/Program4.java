public class Program4 {
    
    public static double feetAndinchesToCentimeter(double feet,double inches){

        if(feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;    //1 Inches = 2.54 cm
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + "cm");
        return centimeters;

    }
    public static double feetAndinchesToCentimeter(double inches){
        
        if(inches < 0){
            System.out.println("Invalid parameter");
            return -1;
        }

        double feet = (int) inches / 12;
        double remaininginches = (int) inches % 12;
        return feetAndinchesToCentimeter(feet, remaininginches);
    }


    public static void main(String[] args) {
        // feetAndinchesToCentimeter(20, 5);
        feetAndinchesToCentimeter(121);
    }
}
