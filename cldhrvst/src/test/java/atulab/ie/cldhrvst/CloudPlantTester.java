package atulab.ie.cldhrvst;

/** Instantiating CloudPlant Class
 *  @author Isabel Conaghan
 */

public static void main(String[] args) {

		// Creating an instance of CloudPlant
		CloudPlant cloudPlant1 = new CloudPlant();

		// Set values using setter methods
		cloudPlant1.setName("Aether Plant");
		cloudPlant1.setColour("Turquoise");
		cloudPlant1.setPurpose("Trade with the Merchants of Zenith");
		cloudPlant1.setNumClouds(30);
		
		// Get and print values using getter methods
		System.out.println("You have found a Cloud Plant! It falls under the category of: "+cloudPlant1.getName());
		System.out.println("It is "+cloudPlant1.getColour()+", and has "+cloudPlant1.getNumClouds()+" clouds, which are useful for "+cloudPlant1.getPurpose());

		// Create another instance of CloudPlant
		CloudPlant cloudPlant2 = new CloudPlant();

		// Set values using setter methods
		cloudPlant2.setName("Celestial Plant");
		cloudPlant2.setColour("Mauve");
		cloudPlant2.setPurpose("emerging from the Moon Morass");
		cloudPlant2.setNumClouds(5);

		System.out.println("\n");
		System.out.println("\n");
				
		// Get and print values using getter methods
		System.out.println("You have found a Cloud Plant! It falls under the category of: "+cloudPlant2.getName());
		System.out.println("It is "+cloudPlant2.getColour()+" and has "+cloudPlant2.getNumClouds()+" clouds, which are useful for "+cloudPlant2.getPurpose());
	}
}