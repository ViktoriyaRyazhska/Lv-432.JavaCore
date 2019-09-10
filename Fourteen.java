import java.util.*;

public class Fourteen {
    static List<Double> list = new ArrayList<>();

    Fourteen(){
        list.add(0.01);
        list.add(0.02);
        list.add(0.05);
        list.add(0.1);
        list.add(0.2);
        list.add(0.5);
        list.add(1.0);
        list.add(2.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 14. Enter the value:");
        double n = scanner.nextDouble();
        findWay(n);
    }

    public static void main(String[] args) {
        new Fourteen();
    }

    private static void findWay(double n){
        double tmp = 0;
        double randomItem = 0;
        int count = 0;
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        Set<String> strings = new HashSet<>();

        while (count !=100){
            randomItem = list.get(random.nextInt(list.size()));
            tmp+= randomItem;
            builder.append(randomItem).append("+");

            if (tmp == n){
                tmp = 0;
                //System.out.println(builder.toString());
                strings.add(builder.toString());
                builder.setLength(0);
                count++;
            }
            if (tmp > n){
                tmp = 0;
                builder.setLength(0);
            }
        }
        System.out.println("Output combinations:");
        for (String s: strings) {
            System.out.println(s);
        }
    }
}
