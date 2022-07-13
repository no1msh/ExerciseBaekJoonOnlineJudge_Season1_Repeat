package chapter11_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        int[][] array = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            String[] inputString = br.readLine().split(" ");
            array[i][1] = Integer.parseInt(inputString[0]);
            array[i][0] = Integer.parseInt(inputString[1]);
        }

        Arrays.sort(array, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i][1]).append(" ").append(array[i][0]).append("\n");
        }

        System.out.print(sb);
    }
}
