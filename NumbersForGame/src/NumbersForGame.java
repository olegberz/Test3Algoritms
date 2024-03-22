import java.util.Scanner;

public class NumbersForGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int playerNumber;
        int computerNumber;

        while (total < 100) {
            System.out.print("Enter your number (1-10): ");
            playerNumber = scanner.nextInt();
            total += playerNumber;
            if (total >= 100) {
                System.out.println("You win!");
                break;
            }

            computerNumber = 11 - playerNumber;
            total += computerNumber;
            System.out.println("Computer chose: " + computerNumber);
            System.out.println("Total: " + total);

            if (total >= 100) {
                System.out.println("Computer wins!");
            }
        }
    }
}
