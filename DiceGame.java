import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name");
	String inputString = scanner.nextLine();
	System.out.println("Hello,"+inputString+"!");
	System.out.println("Rolling dice...");

        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int total = die1 + die2;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);

	if(total > 7){
	    System.out.println(inputString +  " won!");
	}
	else{
	    System.out.println(inputString +  " lost!");
	}
    }
}
