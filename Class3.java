import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Class3 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Input cost of one $: ");
        double costOfDollar = Double.parseDouble(br.readLine());
        System.out.println("Input sum of hryvnas to exchange: ");
        double inputtedSumOfHryvnas = Double.parseDouble(br.readLine());
        double orderedDollars = (inputtedSumOfHryvnas/costOfDollar);
        orderedDollars = Math.round(orderedDollars*100.0)/100.0;
        System.out.println("You get " + orderedDollars + " dollars");

    }
}