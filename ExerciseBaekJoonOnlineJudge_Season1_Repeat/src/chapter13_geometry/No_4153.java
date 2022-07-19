package chapter13_geometry;

import java.io.*;

public class No_4153 {

    public static void printResult(boolean condition) {
        if (condition) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] inputNumber = br.readLine().split(" ");
            if (inputNumber[0].equals("0")) break;

            int a = Integer.parseInt(inputNumber[0]);
            int b = Integer.parseInt(inputNumber[1]);
            int c = Integer.parseInt(inputNumber[2]);
            int max = Math.max(Math.max(a, b), c);

            if (max == a) {
                printResult(a * a == b * b + c * c);
            } else if (max == b) {
                printResult(b * b == a * a + c * c);
            } else {
                printResult(c * c == a * a + b * b);
            }
        }
    }
}
