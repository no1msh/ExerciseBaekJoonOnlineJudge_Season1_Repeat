package chapter07_basic_math1;

import java.io.*;

public class No_2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int findRoom = Integer.parseInt(br.readLine());
        int depth = 1;
        int lastRoom = 1;

        if (findRoom == 1) {
            System.out.print(1);
            return;
        }

        while (lastRoom < findRoom) {
            lastRoom += 6 * depth;
            depth++;
        }

        System.out.print(depth);

    }
}
