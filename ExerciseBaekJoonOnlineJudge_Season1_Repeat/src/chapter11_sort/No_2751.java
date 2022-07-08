package chapter11_sort;

import java.io.*;
import java.util.ArrayList;

public class No_2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        arrayList = mergeSplitFunc(arrayList);

        for (int value : arrayList) {
            sb.append(value).append("\n");
        }

        System.out.print(sb);
    }

    public static ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;

        /// case 1 : left / right 둘다 원소가 남아있을 때
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint++;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint++;
            }
        }

        // case 2 : right 리스트의 데이터가 없을 때
        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint++;
        }

        // case 3 : left 리스트의 데이터가 없을 때
        while (rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint++;
        }

        return mergedList;
    }

    public static ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr;
        ArrayList<Integer> rightArr;
        leftArr = mergeSplitFunc(new ArrayList<>(dataList.subList(0, medium)));
        rightArr = mergeSplitFunc(new ArrayList<>(dataList.subList(medium, dataList.size())));

        return mergeFunc(leftArr, rightArr);
    }
}
