package Task_7_2;

import java.io.*;
import java.util.*;

public class MapCollection {

	public static void main(String[] args) throws Exception {
		Map<Integer, String> employeeMap = new HashMap<>();
		// Add to employeeMap seven pairs (ID, name) of some persons
		employeeMap.put(1, "Petro");
		employeeMap.put(2, "Oleg");
		employeeMap.put(3, "Mykola");
		employeeMap.put(4, "Iryna");
		employeeMap.put(5, "Olga");
		employeeMap.put(6, "Dmytro");
		employeeMap.put(7, "Bogdan");
		System.out.println(employeeMap);

		// Ask user to enter ID, then find and write corresponding name from your map.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter ID (1/2/3/4/5/6/7)");
		int id = Integer.parseInt(bf.readLine());
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (id == entry.getKey()) {
				System.out.println("Value: " + entry.getValue());
			}
		}

		System.out.println("Do we have this ID: " + employeeMap.containsKey(id));

		// Ask user to enter name, verify than you have name in your map and write
		// corresponding ID.

		System.out.println("Enter name");
		String name = bf.readLine();
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (name.equals(entry.getValue())) {
				System.out.println("Key " + entry.getKey());
			}
		}
		System.out.println("Do we have this name: " + employeeMap.containsValue(name));
	}
}
