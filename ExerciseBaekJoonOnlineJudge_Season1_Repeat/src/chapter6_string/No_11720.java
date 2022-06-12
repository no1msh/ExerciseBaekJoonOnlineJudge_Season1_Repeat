package chapter6_string;

import java.io.*;

public class No_11720 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String inputStr = br.readLine();
        int sum = 0;

        for (int i = 0 ; i < n ; i++){
             sum += (inputStr.charAt(i)) - '0';
        }

        System.out.print(sum);
    }
}
