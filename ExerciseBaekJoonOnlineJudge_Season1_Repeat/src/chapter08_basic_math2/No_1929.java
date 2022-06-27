package chapter08_basic_math2;

import java.io.*;

public class No_1929 {

    public static boolean[] prime;

    public static void get_prime() {
        // 소수가 아니면 true 소수라면 false
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = br.readLine().split(" ");
        int start = Integer.parseInt(inputString[0]);
        int end = Integer.parseInt(inputString[1]);
        prime = new boolean[end + 1];
        get_prime();

        for (int i = start ; i<= end; i++){
            if(!prime[i]){
                System.out.println(i);
            }
        }

    }
}
