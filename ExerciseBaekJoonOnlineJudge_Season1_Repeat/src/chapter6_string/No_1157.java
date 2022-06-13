package chapter6_string;

import java.io.*;

public class No_1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] countArray = new int[alphabet.length()];

        for (int i = 0; i < inputString.length(); i++) {

            char indexChar = inputString.charAt(i);

            if ((int) indexChar >= 97) { // 소문자 라면 32를 빼줍니다.
                countArray[indexChar - 32 - 65]++; // 65를 빼주는건 A가 65이기에 0으로 만들기 위해
            } else {
                countArray[indexChar - 65]++;
            }
        }

        int max = 0;
        int maxIndex = -1;

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > max) {
                max = countArray[i];
                maxIndex = i;
            } else if (countArray[i] == max) {
                maxIndex = -2;
            }
        }

        System.out.print((char)(65 + maxIndex));
    }
}