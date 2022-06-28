package chapter08_basic_math2;

import java.io.*;

public class No_4948 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        prime = new boolean[123456 * 2 + 1];
        getPrime();

        while (true) {
            int testCase = Integer.parseInt(br.readLine());
            int count = 0;

            if (testCase == 0) {
                System.out.print(sb);
                break;
            }
            for (int i = testCase + 1; i <= testCase * 2; i++) {
                if (!prime[i]) {
                    count++;
                }
            }

            sb.append(count).append("\n");

        }
    }

    public static void getPrime() {
        // 소수가 아니면 true
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }

        }
    }
}