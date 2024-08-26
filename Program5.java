public class Program5 {
    static double average(int miles, int gallons){
        double mg = (double) miles / gallons;
        mg = Math.round(mg*Math.pow(10,1)); 
        mg /=10;
        return mg;
    }
    public static void main(String[] args){
        int royale_miles = 286;
        int royale_gallons = 9;
        int koopa_miles = 412;
        int koopa_gallons = 40;
        int pipe_miles = 361;
        int pipe_gallons = 18;
        int band_miles = 161;
        int band_gallons = 11;
        
        System.out.println("The average miles per gallon for the Mushroom Cup Prix Racer was");
        System.out.println("The average miles per gallon for the Royale was " + average(royale_miles, royale_gallons) + "m/g");
        System.out.println("The average miles per galln for the Koopa King was " + average(koopa_miles, koopa_gallons) + "m/g");
        System.out.println("The average miles per gallon for the Pipe frame was " + average(pipe_miles, pipe_gallons) + "m/g");
        System.out.println("The average miles per gallon for the Bandwagon was " + average(band_miles, band_gallons) + "m/g");
        
    }
     
}
