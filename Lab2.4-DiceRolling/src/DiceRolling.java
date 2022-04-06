import java.util.Scanner;
import java.util.Random;

public class DiceRolling {

	public static int generateRandomDieRoll(int sides) {
		Random rand = new Random();
		
		int num1 = rand.nextInt(sides);
		return num1 + 1;
	}
	
	public static void isSnakeEyes(int roll1, int roll2) {
		if (roll1 == 1 && roll2 == 1) {
			System.out.println("Snake Eyes!");
		}
	}
	
	public static void isBoxcar(int roll1, int roll2) {
		if (roll1 == 6 && roll2 == 6) {
			System.out.println("Boxcars!");
		}
	}
	
	public static void isCraps(int roll1, int roll2) {
		if (roll1 == 2 || roll2 == 2 || roll1 == 3 || roll2 == 3 || (roll1 + roll2) == 12) {
			System.out.println("Craps!");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int numOfSides;
		int rollNumber = 1;
		String rollAgain;
		
		while (flag == true) {
			System.out.println("How many sides should each die have?");
			numOfSides = input.nextInt();
			
			System.out.println("Roll " + rollNumber + ":");
			int roll1 = generateRandomDieRoll(numOfSides);
			int roll2 = generateRandomDieRoll(numOfSides);
			System.out.println(roll1);
			System.out.println(roll2);
			
			isSnakeEyes(roll1, roll2);
			isBoxcar(roll1, roll2);
			isCraps(roll1, roll2);


			rollNumber++;
			System.out.println("Roll again?(y/n): ");
			rollAgain = input.next();
			if (rollAgain.equalsIgnoreCase("n")) {
				flag = false;
			}
		}
		
		input.close();
		
	}

}
