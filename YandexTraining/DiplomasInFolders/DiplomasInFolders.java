package YandexTraining.DiplomasInFolders;

import java.util.Scanner;

public class DiplomasInFolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFolders = scanner.nextInt(), maxNumberOfDiplomas = 0, result = 0;
        for (int i = 0; i < numberOfFolders; ++i) {
            int numberOfDiplomas = scanner.nextInt();
            if (maxNumberOfDiplomas < numberOfDiplomas) maxNumberOfDiplomas = numberOfDiplomas;
            result += numberOfDiplomas;
        }
        System.out.println(result - maxNumberOfDiplomas);
    }
}
