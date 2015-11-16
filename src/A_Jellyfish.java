import java.util.Random;

/**
 *  Part 1
 * 
 * expected output:
 * 
 *  Moon jelly is the most common of the jelly fish
 *  The white spotted jellyfish has phosphorescent dots
 *  The lion's mane jellyfish is 6ft in diameter and 100 feet long.
 *  The Australian Sea Wasp killed you!
 *  
 *  **the last line should be "did not kill you" based on the function's value
 * 
 * @author cforster
 *
 */


public class A_Jellyfish {
	//MODIFY THIS CODE:
	public static void main(String[] args) {
		
	}
	
	
	//DONT MODIFY THIS CODE:
	static String moonJelly()
	{
		return "Moon jelly is the most common of the jelly fish";
	}
	
	static void whiteSpot()
	{
		System.out.println("The white spotted jellyfish has phosphorescent dots");
	}
	
	static String lionsMane(int length) {
		return "The lion's mane jellyfish is 6ft in diameter and " + length + " feet long.";
	}
	
	static boolean australianSeaWasp() {
		Random gen = new Random();
		return gen.nextBoolean();
	}
	
	
	
}
