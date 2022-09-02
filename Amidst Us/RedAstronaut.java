
public class RedAstronaut extends Player implements Imposter{
	private String skill; //value of either inexperienced, experienced, or expert
	
	private static String DEFAULT_skill = "experienced";
	private static int DEFAULT_susLevel = 15;
	
	public RedAstronaut(string name) {
		this(name, DEFAULT_susLevel, DEFAULT_skill);
	}
	public RedAstronaut(String name, int susLevel, String skill) {
		super(name, susLevel);
		this.skill = skill;
	}
}
