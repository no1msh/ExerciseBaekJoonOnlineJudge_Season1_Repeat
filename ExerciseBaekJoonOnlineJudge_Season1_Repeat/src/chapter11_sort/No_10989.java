package chapter11_sort;

import java.io.*;

public class No_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] countArr = new int[10001];
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            countArr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1 ; i < countArr.length; i++){
            if (countArr[i] > 0){
                for (int j = 0; j < countArr[i] ; j++){
                    sb.append(i).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}