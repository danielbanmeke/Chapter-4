import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if (n > 10)
            System.out.println("> 10");
        else if (n == 10)
            System.out.println("The number is equal to 10");
        else
            System.out.println("The number is less than 10");
    }
}
