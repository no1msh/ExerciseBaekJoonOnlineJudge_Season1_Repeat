package chapter06_string;

import java.io.*;
import java.util.ArrayList;

public class No_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        ArrayList<Character> usedAlphabet = new ArrayList<>();

        String inputStr = br.readLine();

        for (int i = 0; i < inputStr.length(); i++) {
            if (!usedAlphabet.contains(inputStr.charAt(i))) {
                usedAlphabet.add(inputStr.charAt(i));

                if (i == 0) {
                    alphabet[inputStr.charAt(i) - 97] = Integer.MAX_VALUE;
                } else {
                    alphabet[inputStr.charAt(i) - 97] = i;
                }
            }
        }

        for (int value : alphabet) {
            if (value == 0) {
                System.out.print(-1 + " ");
            } else if (value == Integer.MAX_VALUE) {
                System.out.print(0 + " ");
            } else {
                System.out.print(value + " ");
            }
        }
    }
}
