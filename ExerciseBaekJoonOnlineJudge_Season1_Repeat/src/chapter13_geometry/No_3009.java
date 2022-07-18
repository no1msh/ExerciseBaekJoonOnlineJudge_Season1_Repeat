package chapter13_geometry;

import java.io.*;

public class No_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] coordinate1 = br.readLine().split(" ");
        String[] coordinate2 = br.readLine().split(" ");
        String[] coordinate3 = br.readLine().split(" ");
        String[] coordinate4 = new String[2];

        if (coordinate1[0].equals(coordinate2[0])) {
            coordinate4[0] = coordinate3[0];
        } else if (coordinate2[0].equals(coordinate3[0])) {
            coordinate4[0] = coordinate1[0];
        } else {
            coordinate4[0] = coordinate2[0];
        }

        if (coordinate1[1].equals(coordinate2[1])) {
            coordinate4[1] = coordinate3[1];
        } else if (coordinate2[1].equals(coordinate3[1])) {
            coordinate4[1] = coordinate1[1];
        } else {
            coordinate4[1] = coordinate2[1];
        }

        System.out.print(coordinate4[0] + " " + coordinate4[1]);
    }
}

