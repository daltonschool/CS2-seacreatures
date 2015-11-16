//global variables

/*
 * Part 5
 */

public class E_Octopus {
	static String[] hands = new String[8];
	static String name;

	//DO NOT MODIFY THIS CODE:
	public static void main(String[] args) {
		octoStatus();
		setHand("Hammer", 0);
		setHand("Knife", 1);
		setHand("Nail Gun", 3);
		setHand("Saw", 6);
		octoStatus();
		
		for (int i = 0; i < hands.length; i++) {
			if(emptyHand(i)) System.out.println("Hand " + i + " is empty.");
		}
		
		System.out.println("Nail Gun at " + findHand("Nail Gun"));
		System.out.println("Random tool: " + randomHand());
	}
	
	//MODIFY THIS CODE:
	
	/**
	 * prints all the hand tools and the name in the following format:
	 * 
	 * -------------------
	 * Name:[name]
	 * 0:[tool0] | 1:[tool1] | 2:[tool2] | 3:[tool3] |
	 * 4:[tool4] | 5:[tool5] | 6:[tool6] | 7:[tool7] |
	 * -------------------
	 * 
	 */
	static void octoStatus()
	{
		
	}
	
	/**
	 * determines if a hand is empty
	 * @param hand the hand to check
	 * @return true if empty
	 */
	static boolean emptyHand(int hand)
	{
		return false;
	}
	
	/**
	 * set a tool to a given hand
	 * @param tool the tool name
	 * @param hand the hand to put it in
	 */
	static void setHand(String tool, int hand)
	{
		
	}
	
	/**
	 * finds the hand number with the given tool
	 * @param tool the tool to look for
	 * @return the hand that tool is in
	 */
	static int findHand(String tool)
	{
		return 0;
	}
	
	/**
	 * a random tool finder
	 * @return give a random tool in it.
	 */
	static String randomHand()
	{
		return null;
	}
}
