import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        double milesDriven = input.nextDouble();

        System.out.println("Enter gallons used: ");
        double gallonsUsed = input.nextDouble();

        double milesPerGallon;

        milesPerGallon = (milesDriven / gallonsUsed);

        System.out.println("Miles per gallon is: " + milesPerGallon);
    }
}
