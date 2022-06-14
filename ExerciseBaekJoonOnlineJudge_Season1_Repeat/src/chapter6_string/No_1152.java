package chapter6_string;

import java.io.*;

public class No_1152 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        String[] inputStringArray = inputString.split(" ");

        int minus = 0 ;

        if (inputString.charAt(0) == ' '){
            minus++;
        }
        if (inputString.charAt(inputString.length()-1) == ' '){
            minus++;
        }

        System.out.println(inputStringArray.length - minus);

    }
}
