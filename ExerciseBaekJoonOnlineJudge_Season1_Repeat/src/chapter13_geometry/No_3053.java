package chapter13_geometry;

import java.io.*;

public class No_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int r = Integer.parseInt(br.readLine());

        double uclid = r * r * Math.PI;
        double taxi = r * r * 2;

        sb.append(uclid).append("\n").append(taxi);

        System.out.print(sb);

    }
}
