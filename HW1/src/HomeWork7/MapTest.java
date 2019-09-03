package HomeWork7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> mapName = new HashMap<String, String>();
		mapName.put("Smith", "Emma");
		mapName.put("Jones", "John");
		mapName.put("Johnson", "David");
		mapName.put("Lee", "John");
		mapName.put("Brown", "Chris");
		mapName.put("Williams", "Mike");
		mapName.put("Rodriguez", "Mark");
		mapName.put("Garcia", "John");
		mapName.put("Gonzalez", "Daniel");
		mapName.put("Lopez", "Maria");
		for(Map.Entry<String, String> pair : mapName.entrySet()) {
			System.out.println("Last name : "+ pair.getKey() + " first name : " +pair.getValue());
		}
		String delete = "John";
		for (Iterator<?> i = mapName.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = (Entry<String, String>) i.next();
			if (entry.getValue().equals(delete)) {
				i.remove();
			}			
		}
		System.out.println("___________________________________________");
		for(Map.Entry<String, String> pair : mapName.entrySet()) {
			System.out.println("Last name : "+ pair.getKey() + " first name : " +pair.getValue());
		}
	}

}
