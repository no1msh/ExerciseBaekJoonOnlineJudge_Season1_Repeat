package chapter13_geometry;

import java.io.*;

public class No_4153 {
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
                if (a * a == b * b + c * c) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if (max == b){
                if( b * b == a * a + c * c){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else {
                if( c * c == a * a + b * b){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }

        }
    }
}
