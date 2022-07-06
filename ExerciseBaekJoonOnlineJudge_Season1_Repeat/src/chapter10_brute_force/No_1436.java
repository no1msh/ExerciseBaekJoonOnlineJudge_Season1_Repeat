package chapter10_brute_force;

import java.io.*;

public class No_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nth = Integer.parseInt(br.readLine());
        int count = 0;
        int number = 665;

        while (count != nth) {
            number++;
            if (String.valueOf(number).contains("666")) {
                count++;
            }
        }

        System.out.print(number);
    }
}