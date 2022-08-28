
public class Pond {

	public static void main(String[] args) {
		Frog peepo = new Frog("Peepo");
		Frog pepe = new Frog("Pepe",10,15);
		Frog peepaw = new Frog("Peepaw",4.6,5);
		Frog peemaw = new Frog("Peemaw",4.6,10);
		
		Fly fly1 = new Fly(1,3);
		Fly fly2 = new Fly(6);
		Fly fly3 = new Fly(20, 16);
		
		peepo.setSpecies("1331 Frogs");//1
		System.out.println(peepo.toString());//2
		peepo.eat(fly2);//3
		System.out.println(fly2.toString()); //4
		peepo.grow(8); //5
		peepo.eat(fly2);//6
		System.out.println(fly2.toString()); //7
		System.out.println(peepo.toString());//8
		System.out.println(peemaw.toString());//9
		peepaw.grow(4);//10
		System.out.println(peepaw.toString());//11
		System.out.println(pepe.toString());//12
		
	}

}
