package chapter06_string;

import java.io.*;

public class No_2908 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = br.readLine().split(" ");

        String a = inputStr[0];
        String b = inputStr[1];
        String big = null;

        for (int i = 2 ; i >= 0 ; i--){
            if ((int)a.charAt(i)-'0' > (int)b.charAt(i)-'0'){
                big = a;
                break;
            } else if ((int)a.charAt(i)-'0' < (int)b.charAt(i)-'0'){
                big = b;
                break;
            }
        }

        for (int i = 2 ; i >= 0; i--){
            System.out.print(big.charAt(i));
        }
    }
}
