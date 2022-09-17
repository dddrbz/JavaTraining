package JavaKata.SudokuSolutionValidator;

import java.util.HashSet;

public class SudokuSolutionValidator {
    public static boolean check(int[][] sudoku) {
        return checkStringsAndColumns(sudoku) && checkSquares(sudoku);
    }

    public static boolean checkStringsAndColumns(int[][] sudoku) {
        boolean result = true;

        for (int i = 0; i < 9; ++i) {
            HashSet<Integer> setStr = new HashSet<Integer>();
            HashSet<Integer> setClm = new HashSet<Integer>();
            for (int str = 0; str < 9; ++str) {
                setStr.add(sudoku[i][str]);
            }
            for (int clm = 0; clm < 9; ++clm) {
                setClm.add(sudoku[clm][i]);
            }
            if (setStr.size() != 9 || setStr.contains(0)
            || setClm.size() != 9 || setClm.contains(0)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkSquares(int[][] sudoku) {
        boolean result = true;

        int stI = 0, stJ = 0;
        for (int k = 0; k < 9; ++k) {
            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = stI; i < stI + 3; ++i) {
                for (int j = stJ; j < stJ + 3; ++j) {
                    set.add(sudoku[i][j]);
                }
            }
            if (set.size() != 9 || set.contains(0)) {
                result = false;
                break;
            }
            stJ += 3;
            if (stJ > 6) {
                stJ = 0;
                stI += 3;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[][] {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9} }));
    }
}
