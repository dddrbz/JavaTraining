package JavaKata.Dates;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dates {
    private static int[] readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("JavaKata/Dates/input.txt"))) {
            String[] str = reader.readLine().split(" ");
            int[] array = new int[2];
            for (int i = 0; i < 2; ++i) {
                array[i] = Integer.valueOf(str[i]);
            }
            return array;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int[] array = readFile();
        System.out.print(((array[0] > 12 || array[1] > 12) || (array[0] == array[1])) ? 1 : 0);
    }
}
