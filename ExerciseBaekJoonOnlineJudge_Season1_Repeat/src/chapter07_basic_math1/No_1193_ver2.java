package chapter07_basic_math1;

import java.io.*;

public class No_1193_ver2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int temp = 1;
        int temp2 = 2;
        int tempCount = 1;
        int nth;
        int x , y ;

        while (inputNum > temp){
            temp += temp2;
            temp2++;
            tempCount++;
        }

        if (tempCount % 2 == 0){
            x = tempCount;
            y = 1;
        } else {
            x = 1;
            y = tempCount;
        }

        nth = inputNum-temp2;

        for (int i = 0; i < nth ; i++){
            if (tempCount % 2 == 0){
                x -= 1;
                y += 1;
            } else {
                x += 1;
                y -= 1;
            }
        }

        System.out.print(x+"/"+y);

    }
}
