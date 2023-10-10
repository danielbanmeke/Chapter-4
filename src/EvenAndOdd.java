import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
        }
    }
}
