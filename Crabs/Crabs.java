import java.util.Scanner;

public class Crabs {
	private int point;
	private Die die1;
	private Die die2;
	
	//constructor
	public Crabs(){
		die1 = new Die();
		die2 = new Die();
	}
	//Methods
	private int toss() {
		int total = die1.rollDie() + die2.rollDie();
		System.out.println("Die 1: " + die1.getFaceValue() + "\n" + "Die 2: " + die2.getFaceValue());
		return total;
	}
	//Stage 1 - roll dice 7 or 11 = winner, 2, 3 or 12 = Loser, other numbers go to stage2
	private void stage1() {
		point = toss();
		if(point == 7 || point == 11) {
			System.out.println("Total:" + point + "\n" + "Congrats you won!");
		}
		else if(point == 2 || point == 3 || point == 12) {
			System.out.println("Total:" + point + "\n" + "You lost :(");
		}
		else {
			System.out.println("Total:" + point + "\n" + "Welcome to stage 2. Roll until you get a sum of: " + point);
			stage2();
		}
	}
	//Stage 2 - Roll the point number to win, if you roll a sum of 7 you lose
	private void stage2() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter anythything to roll again: ");
	    String go = myObj.nextLine();  // Read user input
	    int total = toss();
	    if(total == point) {
			System.out.println("Total:" + total + "\n" + "Congrats you won!");
		}
		else if(total == 7) {
			System.out.println("Total:" + total + "\n" + "You lost :(");
		}
		else {
			System.out.println("Total:" + total);
			stage2();
		}
	}
	public static void main(String[] args) {
		Crabs game = new Crabs();
		game.stage1();
	}

}


