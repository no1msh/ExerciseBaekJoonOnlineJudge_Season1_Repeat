package chapter10_brute_force;

import java.io.*;

public class No_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        String[][] body = new String[testCase][2];

        for (int i = 0; i < testCase; i++) {
            String[] temp = br.readLine().split(" ");
            body[i][0] = temp[0];
            body[i][1] = temp[1];
        }

        for (int i = 0; i < testCase; i++) {
            int rank = 1;
            int weight1 = Integer.parseInt(body[i][0]);
            int height1 = Integer.parseInt(body[i][1]);

            for (int j = 0; j < testCase; j++) {
                if (i == j) {
                    continue;
                }
                int weight2 = Integer.parseInt(body[j][0]);
                int height2 = Integer.parseInt(body[j][1]);

                if (weight1 < weight2 && height1 < height2) {
                    rank++;
                }
            }

            sb.append(rank).append(" ");

        }

        System.out.print(sb);

    }
}
