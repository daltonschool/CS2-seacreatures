import java.util.Random;

/**
 * Part 6
 * 
 * Your task: 
 * reorganize this class so the main is no more than ten lines.
 * @author cforster
 *
 */

public class F_Seaweed {
	public static void main(String[] args) {
		String[] weedTypes = new String[] {"Green", "Brown", "Red", "Mossy", "Fan-Shaped", "Edible", "Fibrous"};
		String[] weedNames = new String[] {"Algae", "Sea Lettuce", "Weed", "Kelp", "Moss"};
		Random gen = new Random();

		
		//sort the weed types array:
		for (int i = 0; i < weedTypes.length; i++) {
			for (int j = 0; j < weedTypes.length-1; j++) {
				if(weedTypes[j].compareToIgnoreCase(weedTypes[j+1])<0) {
					String temp = weedTypes[j];
					weedTypes[j] = weedTypes[j+1];
					weedTypes[j+1] = temp;
				}
			}
		}

		//sort the weedNames array:
		for (int i = 0; i < weedNames.length; i++) {
			for (int j = 0; j < weedNames.length-1; j++) {
				if(weedNames[j].compareToIgnoreCase(weedNames[j+1])<0) {
					String temp = weedNames[j];
					weedNames[j] = weedNames[j+1];
					weedNames[j+1] = temp;
				}
			}
		}
		
		//all names:
		for (int j = 0; j < weedNames.length; j++) {
			System.out.print(weedNames[j] + ", ");
		}
		
		//random names:
		System.out.println("some random names...");
		for (int j = 0; j < 10; j++) {
			int type = gen.nextInt(weedTypes.length);
			int name = gen.nextInt(weedNames.length);
			String output = weedTypes[type] + " " + weedNames[name];
			System.out.println(output);
		}
		
		System.out.println("more random names...");
		//random names:
		for (int j = 0; j < 12; j++) {
			int type = gen.nextInt(weedTypes.length);
			int name = gen.nextInt(weedNames.length);
			String output = weedTypes[type] + " " + weedNames[name];
			System.out.println(output);
		}		
				
	}	
}
