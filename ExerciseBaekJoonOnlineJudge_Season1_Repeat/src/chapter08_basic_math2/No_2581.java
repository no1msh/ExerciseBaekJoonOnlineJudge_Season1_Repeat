package chapter08_basic_math2;

import java.io.*;

public class No_2581 {

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min > i) min = i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
