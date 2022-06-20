package chapter07_basic_math1;

import java.io.*;

public class No_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int up = Integer.parseInt(inputStr[0]);
        int down = Integer.parseInt(inputStr[1]);
        int height = Integer.parseInt(inputStr[2]);
        int day = 0;

        day = (height - down) / (up - down);

        if ( (height - down) % (up - down) == 0){
            System.out.print(day);
        } else {
            System.out.print(day+1);
        }

    }
}
