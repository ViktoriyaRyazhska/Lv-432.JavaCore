package com.softserve.edu.task_2;

import java.util.*;
import java.util.Map.Entry;

public class Person {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<>();
		personMap.put("Ivanov", "Ivan");
		personMap.put("Petrov", "Petro");
		personMap.put("Vesniy", "Olga");
		personMap.put("Petrova", "Ilona");
		personMap.put("Sydor", "Bogdan");
		personMap.put("Zaremba", "Dmytro");
		personMap.put("Sydorchuk", "Maria");
		personMap.put("Topalov", "Vitaliy");
		personMap.put("Buchak", "Ivan");
		personMap.put("Dub", "Vasyl");

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("There are at less two persons with the same firstName?  " + Person.sameFirstName(personMap));
		Person.removeElementVitaliy(personMap);
        //for (Map.Entry<String, String> entry : personMap.entrySet()) {
		// System.out.println("After Removing "+ entry.getKey() + " " +
		// entry.getValue());}

	}

	public static boolean sameFirstName(Map<String, String> personMap) {
		Set<String> sameName = new HashSet<>(personMap.values());
		return sameName.size() != personMap.size();
	}

	public static void removeElementVitaliy(Map<String, String> personMap) {
		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry entry = (Entry) i.next();
			if (entry.getValue().equals("Vitaliy")) {
				i.remove();
			}
		}
		System.out.println("After removing " + personMap);
	}

}
