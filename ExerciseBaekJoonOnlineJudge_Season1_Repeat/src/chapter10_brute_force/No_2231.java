package chapter10_brute_force;

import java.io.*;

public class No_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(br.readLine());
        int temp = 0;
        int tempDiv;
        int constructor;

        while (true) {
            temp++;
            tempDiv = temp;
            constructor = temp;

            if (temp == inputNumber) {
                System.out.print(0);
                break;
            }

            while (true) {
                if ((tempDiv) < 10) {
                    constructor += tempDiv;
                    break;
                }
                constructor += tempDiv % 10;
                tempDiv /= 10;
            }

            if (constructor == inputNumber) {
                System.out.print(temp);
                break;
            }
        }
    }
}
