import java.util.Random;

public class Die {
	private int faceValue;
	private static final int numberSides = 6;
	private Random rand;
	
	//Constructor
	public Die(){
		faceValue = 1;
		rand = new Random();
	}
	//methods
	public int rollDie(){
		faceValue = rand.nextInt(numberSides)+1;
		return faceValue;
	}
	public int getFaceValue() {
		return faceValue;
	}
}
