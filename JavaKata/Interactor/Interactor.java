package JavaKata.Interactor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Interactor {
    private static int[] readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("JavaKata/Interactor/input.txt"))) {
            int[] array = new int[3];
            for (int i = 0; i < 3; ++i) {
                array[i] = Integer.valueOf(reader.readLine());
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
        switch(array[1]) {
            case 0:
            case 4:
                System.out.print((array[0] == 0) ?
                        ((array[1] == 0) ? array[2] : 4) : 3);
                break;
            case 1:
                System.out.print(array[2]);
                break;
            case 6:
                System.out.print(0);
                break;
            case 7:
                System.out.print(1);
                break;
            default:
                System.out.print(array[1]);
                break;
        }
    }
}
