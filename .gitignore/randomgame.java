
import java.util.Random;
import java.util.Scanner;

public class randomgame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int number = random.nextInt(10000);
		int guess = 1;
		while (guess!=number) {
			System.out.print("Enter a number between 1 to 10000: ");
			guess = scanner.nextInt();
			if (guess<number){
				System.out.println("Low, try again");
			} else if (guess>number) {
				System.out.println("High, try again");
			} else if (guess==number)
				System.out.println("correct, the number was " + number);
			}
	}
}