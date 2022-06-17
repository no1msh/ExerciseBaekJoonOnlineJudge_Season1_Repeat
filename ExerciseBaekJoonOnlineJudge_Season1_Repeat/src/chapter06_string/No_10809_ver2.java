package chapter06_string;

import java.io.*;

public class No_10809_ver2 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0 ; i < alphabet.length(); i++){
            boolean include = false;
            for (int j = 0 ; j < inputStr.length() ; j++){
                if (alphabet.charAt(i) == inputStr.charAt(j)){
                    include = true;
                    System.out.print(j+" ");
                    break;
                }
            }

            if (!include)
                System.out.print(-1 + " ");
        }

    }
}
