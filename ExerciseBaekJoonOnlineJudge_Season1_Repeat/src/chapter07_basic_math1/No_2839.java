package chapter07_basic_math1;

import java.io.*;

public class No_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int requiredSugar = Integer.parseInt(br.readLine());
        int pack3 = 0;
        int pack5 = 0;

        if (requiredSugar % 5 == 0) {
            pack5 = requiredSugar / 5;
        } else {
            for (int i = requiredSugar / 5; i >= 0; i--) {
                if ((requiredSugar - 5 * i) % 3 == 0) {
                    pack3 = (requiredSugar - 5 * i) / 3;
                    pack5 = i;
                    break;
                }
            }
        }

        if (pack3 == 0 && pack5 == 0) pack3 = -1;

        System.out.print(pack3 + pack5);

    }
}
