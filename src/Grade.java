import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Exam Score: ");
        int studentGrade = input.nextInt();
        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();

        if (studentGrade >= 90)
            System.out.println("A");
        else if (studentGrade >= 80)
            System.out.println("B");
        else if (studentGrade >= 70)
            System.out.println("C");
        else if (studentGrade >= 60)
            System.out.println("D");
        else
            System.out.println(" ");
            System.out.println("Failed");
            System.out.println("You must take this course again.");
            System.out.println(" ");

        if (x > 5) {
            if (y > 5)
                System.out.println("x and y are > 5");
        }
        else
            System.out.println("x is <= 5");
        }

    }