package BugInTheLibrary;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BugInTheLibrary {
    private static String[] getStrings() {
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scan = new Scanner(new File("./BugInTheLibrary/input.txt"))) {
            while (scan.hasNextLine()) {
                String check = scan.nextLine();
                if (check.length() != 0) lines.add(check);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] array = lines.toArray(new String[0]);
        return array;
    }

    public static void main(String[] args) {
        String[] lines = getStrings();
        for (int i = 0, count = 1; count <= lines.length; ++i) {
            if (lines[i].contains(Integer.toString(count))) {
                System.out.println(lines[i].replaceAll("[0-9]", ""));
                ++count;
            }
            if (i == lines.length - 1) i = -1;
        }
    }
}
