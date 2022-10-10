package Lesson_three_seminar;

import java.util.Arrays;

public class NQueens {
    static int deskSize;
    static int[][] desk;

    public static void main(String[] args) {
        deskSize = 8;
        desk = new int[deskSize][deskSize];
        if (solveNQeens(0)) {
            for (var row : desk) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("Задача не имеет решения.");
        }
    }

    public static boolean solveNQeens(int col) {
        if (col == deskSize) return true;

        for (int row = 0; row < deskSize; row++) {
            if (isSafe(row, col, desk)) {
                desk[row][col] = 1;
                if (solveNQeens(col + 1)) return true;

                desk[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int row, int col, int[][] desk) {
        for (int i = col - 1; i >= 0; i--) {
            if (desk[row][i] == 1) return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (desk[i][j] == 1) return false;
        }

        for (int i = row + 1, j = col - 1; i < desk.length && j >= 0; i++, j--) {
            if (desk[i][j] == 1) return false;
        }

        return true;
    }
}
