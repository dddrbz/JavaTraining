package JavaKata.Roma;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Hello write Go and press Enter");

        String result = scan.nextLine();

        dot: while (!result.equals("Back")) {
            int first = rand.nextInt(100);
            int second = rand.nextInt(100);

            if ((result = ascTask(first, second, result)).equals("Back")) {
                break;
            }

            while (Integer.valueOf(result) != first + second) {
                System.out.println("It's wrong, try again:");

                if ((result = ascTask(first, second, result)).equals("Back")) {
                    break dot;
                }
            }

            System.out.println("Super! Go next? If you want to get out write \"Back\"");

            result = scan.nextLine();
        }
    }

    private static boolean checkString(String str) {
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    private static String ascTask(int first, int second, String result) {
        System.out.println(first + " + " + second + " = ?");
        result = scan.nextLine();

        while (!checkString(result)) {
            if (result.equals("Back")) {
                return result;
            }

            System.out.println("Please write a number or \"Back\" to quit");
            result = scan.nextLine();
        }

        return result;
    }
}
