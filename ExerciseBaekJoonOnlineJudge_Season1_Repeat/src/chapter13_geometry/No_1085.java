package chapter13_geometry;

import java.io.*;

public class No_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int x = Integer.parseInt(inputStr[0]);
        int y = Integer.parseInt(inputStr[1]);
        int w = Integer.parseInt(inputStr[2]);
        int h = Integer.parseInt(inputStr[3]);


        int horizontalTemp = 0;
        int verticalTemp = 0;

        if (x > w - x) // x가 w에 가까울때
            horizontalTemp = w - x;
        else
            horizontalTemp = x;

        if (y > h - y) // y가 h에 가까울 때
            verticalTemp = h - y;
        else
            verticalTemp = y;

        if (horizontalTemp > verticalTemp)
            System.out.print(verticalTemp);
        else
            System.out.print(horizontalTemp);
    }
}
