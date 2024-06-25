import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);

        System.out.print("Type the number: ");
        int number = sin.nextInt();
        System.out.print("Type the source base: ");
        int sourceBase = sin.nextInt();
        System.out.print("Type the target base: ");
        int targetBase = sin.nextInt();

        int digit, s, i = 0, j = 0, baseTen = 0, answer = 0;

        // conversion of the number from its current base to base ten
        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            baseTen = (int) (baseTen + (digit * (Math.pow(sourceBase, i++))));
        }

        // conversion of the number from base ten to the target base
        while (baseTen > 0) {
            s = baseTen % targetBase;
            answer = (int) (answer + (s * (Math.pow(10, j++))));
            baseTen = baseTen / targetBase;
        }

        System.out.println("answer: " + answer);
    }

}