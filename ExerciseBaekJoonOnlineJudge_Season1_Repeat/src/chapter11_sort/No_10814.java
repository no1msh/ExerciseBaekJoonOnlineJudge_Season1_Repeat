package chapter11_sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class No_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        String[][] members = new String[testCase][2];

        for (int i = 0 ; i < testCase ; i++){
            members[i] = br.readLine().split(" ");
        }

        Arrays.sort(members ,new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0 ; i < testCase ; i++){
            sb.append(members[i][0]).append(" ").append(members[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}
