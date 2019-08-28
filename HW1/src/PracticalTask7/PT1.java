package PracticalTask7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
public class PT1  {

	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<Integer>();		
//		Random rn = new Random();
//		for (int i = 0; i < 10; i++) {
//			myCollection.add(rn.nextInt(200)-100);
//		}
//		System.out.println(myCollection.toString());
		
		
		
		//Find and save in list newCollection all positions of element more than 5 in the collection.
		//Print newCollection
//		List<Integer> myCollection5 = new ArrayList<Integer>();
//		for (Integer integer : myCollection) {
//			if (integer > 5) {
//				myCollection5.add(integer);
//			}
//		}
//		System.out.println(myCollection5.toString());
		int[] iarry = {20,11,22,15,7,-22,50,25,21,20};
		for (int i : iarry) {			
			myCollection.add(i);
		}
		List<Integer> myCollectionGreater20 = new ArrayList<>();
		System.out.println(myCollection.toString());
		//Remove from collection myCollection elements, which are greater then 20. Print result
		for (Integer integer : myCollection) {				
			if (integer > 20) {
				myCollectionGreater20.add(integer);				
			}
		}
		Iterator<Integer> iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			if(iterator.next() <=20) {
				iterator.remove();
			}
		}
		int counter = 0;
		while(counter < myCollection.size()) {
			if (myCollection.get(counter) <= 20) {
				myCollection.remove(counter);
				counter--;
			}
			counter++;
		}
		
		System.out.println(myCollection.toString());
		System.out.println(myCollectionGreater20.toString());
		
		//Insert elements 1, 3, 4 in positions 2, 8, 5. Print result in the format:
		//“position – xxx, value of element – xxx”
//		myCollection.removeAll(myCollection);
//		for (int i = 0; i < 10; i++) {
//			myCollection.add(rn.nextInt(200)-100);
//		}
//		System.out.println(myCollection);
//		for (int i = 0; i < myCollection.size(); i++) {
//			System.out.println("position = "+ (i+1) +" value of element = "+myCollection.get(i));			
//		}
//		int trnz;
//		trnz = myCollection.get(0);
//		myCollection.set(0, myCollection.get(1));
//		myCollection.set(1, trnz);
//		trnz = myCollection.get(2);
//		myCollection.set(2, myCollection.get(7));
//		myCollection.set(7, trnz);
//		trnz = myCollection.get(3);
//		myCollection.set(3, myCollection.get(4));
//		myCollection.set(4, trnz);
//		
		System.out.println("=====================================================");
		
//		for (int i = 0; i < myCollection.size(); i++) {
//			System.out.println("position = "+ (i+1) +" value of element = "+myCollection.get(i));
//		}
//		Collections.sort(myCollection);
//		System.out.println(myCollection);
	}

}
