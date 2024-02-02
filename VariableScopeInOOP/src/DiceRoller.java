import java.util.Random;

public class DiceRoller {
	
	//global
	Random random;
	int number;
	
	DiceRoller() {
		// local
		/*
		Random random = new Random();
		int number = 0;
		roll(random, number);
		*/
		
		random = new Random();
		roll();
		
	}
	/*
	void roll(Random random, int number) {
		
		number = random.nextInt(6)+1;
		
		System.out.println(number);
		
	}
	*/
	
	void roll() {
		
		number = random.nextInt(6)+1;
		
		System.out.println(number);
		
	}

}
