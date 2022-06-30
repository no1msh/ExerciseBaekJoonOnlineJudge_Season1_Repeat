package chapter09_recursive_function;

import java.io.*;

public class No_2447 {
    public static char[][] array;

    public static void printStar(int x, int y, int number) {
        // 가장 작은 크기의 셀일 경우
        if (number == 1) {
            array[x][y] = '*';
            return;
        }

        int cellSize = number / 3; // 한칸의 크기
        int count = 0; // 몇번째 칸

        for (int i = x; i < x + number; i += cellSize) {
            for (int j = y; j < y + number; j += cellSize) {
                count++;
                if (count == 5) { // 9개로 칸을 나눈다 했을때 빈칸이 되는 칸은 5번째
                    printBlank(i, j, cellSize);
                } else {
                    printStar(i, j, cellSize); // 재귀 호출
                }
            }
        }
    }

    public static void printBlank(int x, int y, int number) {
        for (int i = x; i < x + number; i++) {
            for (int j = y; j < y + number; j++) {
                array[i][j] = ' ';
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        array = new char[number][number];

        printStar(0, 0, number);

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                sb.append(array[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}