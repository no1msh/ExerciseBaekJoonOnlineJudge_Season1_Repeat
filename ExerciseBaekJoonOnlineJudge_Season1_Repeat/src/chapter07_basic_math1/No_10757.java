package chapter07_basic_math1;

import java.io.*;
import java.math.BigInteger;

public class No_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputString = br.readLine().split(" ");

        BigInteger a = new BigInteger(inputString[0]);
        BigInteger b = new BigInteger(inputString[1]);

        System.out.print(a.add(b));

    }
}
