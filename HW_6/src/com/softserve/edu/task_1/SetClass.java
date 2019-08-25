package com.softserve.edu.task_1;

import java.util.*;

public class SetClass {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		set1.add(9);
		for (Integer i : set1) {
			System.out.println("Set1 " + i);
		}

		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set2.add(7);
		set2.add(9);
		System.out.println();
		for (Integer i : set2) {
			System.out.println("Set2 " + i);
		}

		// System.out.println("\nUnion set1 and set2");
		// SetClass.union(set1, set2);

		System.out.println("\nIntersect set1 and set2");
		SetClass.intersect(set1, set2);

	}

	public static void union(Set<Integer> set1, Set<Integer> set2) {
		set1.addAll(set2);
		for (Integer integer : set1) {
			System.out.println(integer);
		}
	}

	public static void intersect(Set<Integer> set1, Set<Integer> set2) {
		set1.retainAll(set2);
		for (Integer integer : set1) {
			System.out.println(integer);
		}

	}
}
