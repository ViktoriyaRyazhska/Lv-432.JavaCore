package Task_7_1;

import java.util.*;

public class ArrayCollection {
	public static void main(String[] args) {
		Random r = new Random();
// Declare collection myCollection of 10 integers
		List<Integer> myCollection = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			int j = r.nextInt(40);
			myCollection.add(j);
			System.out.println("myCollection position " + i + " value " + j);

		}
// Find and save in list newCollection all positions of element more than 5 in
// the collection
		System.out.println();
		List<Integer> newCollection = new ArrayList<>();

		for (Integer integer : myCollection) {
			if (integer > 5) {
				newCollection.add(integer);
			}
		}

		System.out.println("newCollection " + newCollection);
		System.out.println();

// Remove from collection myCollection elements, which are greater then 20

		Iterator<Integer> iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			int number = iterator.next();
			if (number > 20) {
				iterator.remove();
			}
		}
		System.out.println("myCollection after remove elements " + myCollection);

// Insert elements 1, -3, -4 in positions 2, 8, 5
		System.out.println();
		try {
			// myCollection.add(8,-3);
			myCollection.add(2, 1);
			myCollection.add(5, -4);
			myCollection.add(8, -3);
			for (int i = 0; i < myCollection.size(); i++) {

				System.out.println("Position " + i + " value of element " + myCollection.get(i));
			}
		} catch (Exception e) {
			System.out.println("The size of the array is less than 8 " + e);
		}
//Sort and print collection
		System.out.println();
		Collections.sort(myCollection);
		System.out.println("Sorted collection " + myCollection);

	}

}
