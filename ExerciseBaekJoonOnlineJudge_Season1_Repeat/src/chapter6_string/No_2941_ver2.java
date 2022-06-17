package chapter6_string;

import java.io.*;

public class No_2941_ver2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatiaAlphabet) {
            if (inputString.contains(s)) {
                inputString = inputString.replace(s, "0");
            }
        }

        System.out.print(inputString.length());

    }
}
