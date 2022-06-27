package chapter08_basic_math2;

import java.io.*;

public class No_11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                System.out.println(i);
            }

        }
    }
}
