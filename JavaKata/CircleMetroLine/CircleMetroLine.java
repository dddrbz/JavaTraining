package JavaKata.CircleMetroLine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CircleMetroLine {
    private static int[] readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("JavaKata/CircleMetroLine/input.txt"))) {
            String[] str = reader.readLine().split(" ");
            int[] array = new int[str.length];
            for (int i = 0; i < str.length; ++i) {
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
        int min = (array[1] < array[2]) ? array[1] : array[2];
        int max = (array[1] > array[2]) ? array[1] : array[2];
        int front = max - min - 1;
        int back = min + array[0] - max - 1;
        System.out.print((front < back) ? front : back);
    }
}
