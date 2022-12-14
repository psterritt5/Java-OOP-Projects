
public class Fly {
	private double massGrams;
	private double speed;
	private final static double massGramsDefault = 5;
	private final static double speedDefault = 10;
	
	//Constructors
	public Fly() {
		this(massGramsDefault, speedDefault);
	}
	public Fly(double massGrams) {
		this(massGrams,speedDefault);
	}
	public Fly(double massGrams, double speed) {
		this.massGrams = massGrams;
		this.speed = speed;
	}
	
	//Methods
	public void setMass(double massGrams) {
		this.massGrams = massGrams;
	}
	public double getMass() {
		return this.massGrams;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSpeed() {
		return this.speed;
	}
	public boolean isDead() {
		return this.massGrams == 0;
	}
	public String toString() {
		if(this.isDead()) {
			return "I’m dead, but I used to be a fly with a speed of " + this.speed + ".";
		}
		else {
			return "I’m a speedy fly with "+this.speed+" speed and "+this.massGrams+" mass.";
		}
	}
	public void grow(int gainedMass) {
		for(int i=0; i<gainedMass; i++) {
			this.massGrams += 1;
			if (this.massGrams < 20)
				this.speed+=1;
			else
				this.speed+=-0.5;
		}
	}
}
