package chapter08_basic_math2;

import java.io.*;

public class No_9020 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        prime = new boolean[10000];
        getPrime();

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int number = Integer.parseInt(br.readLine());

            // number가 나눴을때 딱 떨어지는 소수인경우
            if (!prime[number / 2]) {
                sb.append(number / 2).append(" ").append(number / 2).append("\n");
            } else {
                // 딱 떨어지지 않아서 앞의 수를 내리고 뒤에수를 올리는 경우
                int firstIndex = number / 2;
                int lastIndex = number / 2;

                while (true) {
                    firstIndex--;
                    lastIndex++;
                    if (!prime[firstIndex] && !prime[lastIndex]) {
                        sb.append(firstIndex).append(" ").append(lastIndex).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.print(sb);

    }

    public static void getPrime() {
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
