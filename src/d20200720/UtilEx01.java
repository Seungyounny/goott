package d20200720;

import java.util.Random;

public class UtilEx01 {
	public static void main(String[] args) {
		//Math.random(); ==> double type return
		
		Random rnd = new Random();
		
		rnd.setSeed(2);
		int value = rnd.nextInt(45);
		
		rnd.setSeed(1);
		value = rnd.nextInt(45);
		
		System.out.println(value);
	}

}
