package chapter6_string;

import java.io.*;

public class No_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String callNumber = br.readLine();
        int requireTime = 0;

        for (int i = 0; i < callNumber.length(); i++) {
            for (int j = 0 ; j < dial.length; j++){
                if(dial[j].contains(String.valueOf(callNumber.charAt(i)))){
                    requireTime += j+1;
                    break;
                }
            }
        }

        System.out.print(requireTime);

    }
}
