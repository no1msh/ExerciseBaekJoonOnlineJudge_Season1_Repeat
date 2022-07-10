package chapter11_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class No_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> inputArr = new ArrayList<>();
        int[] overlap = new int[8002];
        int average = 0;
        int medium;
        int manyShow;
        int range;

        while (testCase-- > 0) {
            int value = Integer.parseInt(br.readLine());
            if (value < 0) {
                overlap[value + 8001]++;
            } else {
                overlap[value]++;
            }

            average += value;
            inputArr.add(value);
        }

        inputArr.sort(Comparator.naturalOrder());

        average = (int) Math.round((double) average / inputArr.size());
        medium = inputArr.get(inputArr.size() / 2);

        int maxShow = 0;
        int maxShowIndex = -1;
        ArrayList<Integer> overlaps = new ArrayList<>();
        boolean isOverlap = false;

        for (int i = 0; i < overlap.length; i++) {
            if (overlap[i] > maxShow) {
                overlaps.clear();
                maxShow = overlap[i];
                maxShowIndex = i;
            }
            if (overlap[i] == maxShow) {
                isOverlap = true;
                if (i > 4000) {
                    if (!overlaps.contains(i - 8001)) {
                        overlaps.add(i - 8001);
                    }
                } else {
                    if (!overlaps.contains(i)) {
                        overlaps.add(i);
                    }
                }
            }
        }

        overlaps.sort(Comparator.naturalOrder());
        if (isOverlap) {
            if (overlaps.size() < 2) {
                manyShow = overlaps.get(0);
            } else {
                manyShow = overlaps.get(1);
            }
        } else {
            manyShow = maxShowIndex;
        }
        range = inputArr.get(inputArr.size() - 1) - inputArr.get(0);

        sb.append(average).append("\n").append(medium).append("\n").append(manyShow).append("\n").append(range);
        System.out.print(sb);
    }
}