package chapter11_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class No_2750 {

    public static void bubbleSort(ArrayList<Integer> dataList) {
        for (int index = 0; index < dataList.size() - 1; index++) {
            boolean swap = false;
            for (int index2 = 0; index2 < dataList.size() - 1 - index; index2++) {
                if (dataList.get(index2) > dataList.get(index2 + 1)) {
                    Collections.swap(dataList, index2, index2 + 1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> dataList = new ArrayList<>();
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            dataList.add(Integer.parseInt(br.readLine()));
        }

        bubbleSort(dataList);

        for (int value : dataList) {
            System.out.println(value);
        }
    }
}
