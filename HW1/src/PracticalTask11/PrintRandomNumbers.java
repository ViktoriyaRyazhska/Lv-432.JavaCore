package PracticalTask11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class PrintRandomNumbers {

	public static void main(String[] args) {
		//Print n random numbers on console using Java 8
		Random random = new Random();
		System.out.println("Print n random numbers on console using Java 8");
		random.ints(0,20).limit(10).forEach(System.out::println);

		//Print n random numbers on console using Java 8 in a sorted order
		System.out.println("Print n random numbers on console using Java 8 in a sorted order");
		random.ints(0,25).limit(10).sorted().forEach(System.out :: println);

		//Using Java 8 show the biggest number from n random numbers		
		List<Integer> integers = Arrays.asList(1,5,9,7,6,9,1);
		System.out.println("show the biggest number from n random numbers");
		IntSummaryStatistics statistics = integers.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println(statistics.getMax());

		//Show witch today is a day of a week
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfWeek());

		//Show a date of first Monday for current month
		System.out.println(date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

		List<String> listNames =new ArrayList<String>();
		listNames.add("Vsfca");
		listNames.add("Gmx");
		listNames.add("Dmccmx");
		listNames.add("MmccSDmx");
		listNames.forEach(System.out ::println);
		PrintRandomNumbers.sortUsingJava8(listNames);
		System.out.println("Sort_________________________");
		listNames.forEach(System.out ::println);

	}
	//Write a method for sorting list of Strings using Java 8
	public static void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
	public static void sortLength(List<String > names) {
		Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
	}
}
