package JavaKata.SchoolConstruction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SchoolConstruction {
    private static int[] readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("JavaKata/SchoolConstruction/input.txt"))) {
            int[] array = new int[Integer.valueOf(reader.readLine())];
            String[] str = reader.readLine().split(" ");
            for (int i = 0; i < array.length; ++i) {
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
        System.out.print(array[array.length / 2]);
    }
}
