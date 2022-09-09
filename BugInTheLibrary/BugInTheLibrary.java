package BugInTheLibrary;

import java.io.*;
import java.util.HashMap;

public class BugInTheLibrary {
    public static void main(String[] args) {
        int count = 1;
        HashMap<Integer, String> lines = new HashMap<Integer, String>();
        try (BufferedReader reader = new BufferedReader(new FileReader("./BugInTheLibrary/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder bufLine = new StringBuilder(line);
                int number = 0;
                boolean digitFlag = false;
                    for (int i = 0; i < bufLine.length(); ++i) {
                        if (bufLine.charAt(i) >= '0' && bufLine.charAt(i) <= '9') {
                            number *= (digitFlag) ? 10 : 1;
                            number += bufLine.charAt(i) - '0';
                            bufLine.deleteCharAt(i--);
                            digitFlag = true;
                        }
                    }
                    lines.put(number, new String(bufLine));
                    for (; lines.containsKey(count); ++count) {
                        System.out.println(lines.get(count));
                        lines.remove(count);
                    }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}