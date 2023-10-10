import java.util.Scanner;
public class GasMileage {

    private double milesDriven;
    private double gallonsUsed;
    private int totalMilesPerGallons = 0;
    int tripCounter = 0;

    public double calculateMilesPerGallons() {
        double milesPerGallon;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to record miles driven and gallons used for each trips and to end ");
        int trips = input.nextInt();

        int newTrips = 1;

        while (trips != 0) {
            System.out.print("Enter miles driven: ");
            milesDriven = input.nextDouble();

            System.out.print("Enter gallons used: ");
            gallonsUsed = input.nextDouble();

            milesPerGallon = (milesDriven / gallonsUsed);
            System.out.printf("Miles per gallon for trip %d is: %.2f%n%n", newTrips, milesPerGallon);

            totalMilesPerGallons += milesPerGallon;
            newTrips++;

            System.out.print("Enter 1 to continue and 0 to end: ");
            trips = input.nextInt();
        }
        input.close();
        this.tripCounter = newTrips;
        return totalMilesPerGallons;

    }

    public static void main(String[] args) {
        GasMileage Driver1 = new GasMileage();

        System.out.printf("%nTotal miles per gallons for all trips is %.2f%n", Driver1.calculateMilesPerGallons());
    }

}

