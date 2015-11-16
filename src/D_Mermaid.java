//take parameters, return value

/**
 * Part 4
 * 
 * expected output: 
 *  A female is called a mermaid
 *  A male is called a merman
 * 	The oldest mermaid is 86 years old 
 *  Mermaids like to swim swim swim swim swim!
 *  some mer ages: 23, 44, 25, 1, 12, 99,
 *  King Triton is 86 sea years old!
 *  
 * 
 * @author cforster
 *
 */

public class D_Mermaid {
	//DO NOT MODIFY THIS CODE:
	public static void main(String[] args) {
		System.out.println("A female is called a " + name(true));
		System.out.println("A male is called a " + name(false));
		System.out.println("the oldest mermaid is " + 
							oldest(new int[] {12, 13, 25, 86, 23, 45, 11, 12}) + 
							"years old");
		System.out.println("Mermaids like to " + swim(5) + "!");
		
		int[] ages = getAges(6);
		System.out.print("some mer ages: ");
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + ", ");
		}
		System.out.println();
		
		System.out.println("King Triton is " + oldest(getAges(40)) + " sea years old.");
	}
	
	//MODIFY THIS CODE:
	/**
	 * gives the title of a mer person
	 * @param isFemale true if female, false if not
	 * @return mermaid or merman
	 */
	static String name(boolean isFemale)
	{
		return null;
	}
	
	/**
	 * find the oldest merperson
	 * @param ages an array of ages
	 * @return the largest number in the array
	 */
	static int oldest(int[] ages)
	{
		return 0;
	}
	
	/**
	 * repeat swim some number of times
	 * @param times the number of times to repeat
	 * @return the string of swims
	 */
	static String swim(int times) {
		return null;
	}
	
	/**
	 * gives a random list of merperson ages (mermaids never get older than 100)
	 * @param count the number of ages to give
	 * @return the array of ages
	 */
	static int[] getAges(int count)
	{
		return null;
	}
}
