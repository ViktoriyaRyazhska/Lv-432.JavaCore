import java.io.BufferedReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class Practice {

    public static void main(String[] args) {

        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("1. Random ints");
        Random random = new Random();
        random.ints().limit(n).forEach(System.out::println);

        System.out.println("2. Ordered random ints");
        random.ints().limit(n).sorted().forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>();
        random.ints().limit(n).forEach(numbers::add);
        System.out.println("3. List : " + numbers);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());

        LocalDate today = LocalDate.now();
        System.out.println("4. Today is " + DayOfWeek.from(today));

        System.out.println("5. First Monday for current month: "+today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        List<String> names = Arrays.asList("Andrew", "Alex", "Molly", "Zick");
        System.out.println("6. Unsorted: "+names);
        sortUsingJava8(names);
        System.out.println("Sorted: "+names);
    }

    private static void sortUsingJava8(List<String> names) {
        names.sort(String::compareTo);
    }
}
