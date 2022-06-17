package chapter06_string;

import java.io.*;

public class No_2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] inputString = br.readLine().split(" ");

            int stringCount = Integer.parseInt(inputString[0]);
            String repeatString = inputString[1];

            for (int j = 0; j < repeatString.length(); j++) {

                for (int z = 0; z < stringCount; z++) {
                    System.out.print(repeatString.charAt(j));
                }
            }

            System.out.println();
        }

    }
}
