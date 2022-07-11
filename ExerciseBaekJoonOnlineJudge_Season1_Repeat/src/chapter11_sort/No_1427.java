package chapter11_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class No_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String inputString = br.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            arrayList.add((inputString.charAt(i) - '0'));
        }

        arrayList.sort(Comparator.reverseOrder());

        for (int value : arrayList) {
            sb.append(value);
        }

        System.out.print(sb);
    }
}
