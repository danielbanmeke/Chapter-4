import java.util.Scanner;

public class CarAverage {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int total = 0;
    int carCounter = 1;

    while (carCounter <= 20){
        System.out.println("Enter number car: ");
        int car = input.nextInt();
        total = total + car;
        carCounter = carCounter + 1;
    }

    int average = total / 20;

        System.out.printf("%n Total of all cars plying Brown road daily is %d%n", total);
        System.out.printf("Car Average is %d%n", average);
    }
}
