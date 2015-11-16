import java.util.Random;

/*
 * Part 2
 * 
 * Expected Output:
 * 
 *   The scientific name for the sea cucumber is Holothuroidea
 *   There are 1250 species of sea cucumber.
 *   My favorite type is the warty sea cucumber.
 *   I have 239 sea cucumbers in my pond.
 *   My favorite sea cucumber song is Ode to the Cucumber.
 */
public class B_SeaCucumbers {
	//DONT MODIFY THIS CODE:
	public static void main(String[] args) {
		System.out.print("The scientific name for the sea cucumber is ");
		science();
		
		System.out.print("There are " + species() + " species of sea cucumber.");
		
		System.out.println("My favorite type is the " + warty() + " sea cucumber.");
		
		System.out.println("I have " + rando().nextInt(500) + " sea cucumbers in my pond.");
		
		System.out.println("My favorite sea cucumber song is " + song()[2] + ".");
	}
	
	//MODIFY THIS CODE:
	static void science()
	{
		
	}
	
	static int species()
	{
		return 0;
	}
	
	static String warty()
	{
		return null;
	}
	
	static Random rando()
	{
		return null;
	}
	
	static String[] song()
	{
		return null;
	}
}

//use functions
//break a long main into functions
//design some functions