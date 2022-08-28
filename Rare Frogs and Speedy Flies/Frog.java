
public class Frog {
	private String name;
	private int ageInMonths;
	private double tongueSpeed;
	private boolean isFroglet;
	private static String species = "Rare Pepe";
	
	//private static final String speciesDefault = "Rare Pepe";
	private static final int ageInMonthsDefault = 5;
	private static final double tongueSpeedDefault = 5;
	
	public Frog(String name) {
		this(name,ageInMonthsDefault,tongueSpeedDefault);
	}
	public Frog(String name, double ageInYears, double tongueSpeed) {
		//int ageInMonths = (int) ageInYears * 12;
		this(name,((int)(ageInYears*12)),tongueSpeed);
	}
	public Frog(String name, int ageInMonths, double tongueSpeed) {
		this.name = name;
		this.ageInMonths = ageInMonths;
		this.tongueSpeed = tongueSpeed;
		//This is not mentioned in the instructions but failing to set this would err the toString method
		this.isFroglet = this.ageInMonths > 1 && this.ageInMonths < 7;
	}
	public void grow() {
		grow(1);
	}
	public void grow(int months){
		for (int i=0; i<months; i++) {
			this.ageInMonths++;
			if(this.ageInMonths <=12)
				this.tongueSpeed++;
			else if(this.ageInMonths>30 && tongueSpeed>=6)
				tongueSpeed--;
		}
		this.isFroglet = this.ageInMonths > 1 && this.ageInMonths < 7;
	}
	public void eat(Fly fly) {
		if(fly.isDead())
			return;
		else {
			if (this.tongueSpeed > fly.getSpeed()) {
				if (fly.getMass() >= 0.5*this.ageInMonths)
					this.grow(1);
				fly.setMass(0);
			}
			else
				fly.grow(1);
		}
	}
	public String toString() {
		if(this.isFroglet)
			return "My name is " +this.name+" and I'm a rare froglet! I'm "+this.ageInMonths+" months old and my tongue has a speed of "+this.tongueSpeed+".";
		else
			return "My name is " +this.name+" and I'm a rare frog. I'm "+this.ageInMonths+" months old and my tongue has a speed of "+this.tongueSpeed+".";
	}
	public void setSpecies(String setSpecies) {
		species = setSpecies;
	}
	public String getSpecies() {
		return species;
	}
}
