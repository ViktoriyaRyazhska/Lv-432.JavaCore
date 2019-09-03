package PracticalTask9;

public class PlantMain {

	public static void main(String[] args) {		
		Plant[] plants = new Plant[5];
		try {
			plants[0] = new Plant(7, "blue", "type1");
			plants[1] = new Plant(10, "white", "type2");
			plants[2] = new Plant(5, "green", "type3");
			plants[3] = new Plant(3, "green", "type3");
			plants[4] = new Plant(9, "white", "type2");
			
		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Plant plant : plants) {
			System.out.println(plant.toString());
		}
	}

}
