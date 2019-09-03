package ua.com.softserve.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text:");


        String pattern = "\\$(\\d*)(\\.\\d{2})?";
        String txt = br.readLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(txt);

        List<String> list = new ArrayList<>();
        while (m.find()) {

            list.add(txt.substring(m.start(), m.end()));
        }
        System.out.println("Result: " + list);

    }

}


