package chapter5_method;

import java.io.*;
import java.util.ArrayList;

public class No_1065 {

    // x가 한수인지 판별하는 함수
    static boolean isHansu(int x) {

        int initNum = x;
        int diff;
        ArrayList<Integer> arr = new ArrayList<>();

        if (initNum < 100)
            return true;

        do {
            arr.add(initNum % 10);
            initNum /= 10;
        } while (initNum != 0);

        diff = arr.get(0) - arr.get(1);

        for (int i = 1; i < arr.size() - 1; i++) {
            if (diff != arr.get(i) - arr.get(i + 1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int inputNum = Integer.parseInt(br.readLine());

        for (int i = 1; i <= inputNum; i++) {
            if (isHansu(i))
                count++;
        }

        System.out.print(count);

    }
}