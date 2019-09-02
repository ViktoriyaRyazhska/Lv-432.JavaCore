package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4v2 {

    private static final String readFileName = "file1.txt";
    private static final String writeFileName = "file2.txt";
    private static final String namePattern = "\\[name:(\\w+)\\]";
    private static final String birthdayPattern = "\\[birthday:(((\\d{2})\\.){2}(\\d{4}))]";
    private static String[] lines;

    public static void main(String[] args) {
        lines = getArrayOfStringFromFile();

        writeDataToFile("Number of lines : " + lines.length,
                "Longest line : \'" + getLongestLine() + "\'",
                getDataByPattern(namePattern),
                getDataByPattern(birthdayPattern));
    }

    // Assuming file size is less than Integer.MAX_VALUE
    private static int getFileSize() {
        int n = 0;
        try (FileInputStream fileInputStream = new FileInputStream(readFileName)) {
            while (fileInputStream.read() > 0) {
                n++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }

    private static String[] getArrayOfStringFromFile() {
        byte[] fileContent = new byte[getFileSize()];

        try (FileInputStream fileInputStream = new FileInputStream(readFileName)) {
            fileInputStream.read(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(fileContent).split("\n");
    }

    private static String getDataByPattern(String pattern) {
        int groupToGet = 1;
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        for (String line : lines) {
            m = p.matcher(line);
            if (m.find()) {
                return m.group(groupToGet);
            }
        }
        return "";
    }

    private static String getLongestLine() {
        int length = lines[0].length();
        int index = 0;
        for (int i = 1; i < lines.length; i++) {
            if (lines[i].length() > length) {
                length = lines[i].length();
                index = i;
            }
        }
        return lines[index];
    }

    private static void writeDataToFile(String... stuff) {
        try (FileOutputStream fos = new FileOutputStream(writeFileName)) {
            for (String thing : stuff) {
                fos.write(thing.getBytes());
                fos.write("\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
