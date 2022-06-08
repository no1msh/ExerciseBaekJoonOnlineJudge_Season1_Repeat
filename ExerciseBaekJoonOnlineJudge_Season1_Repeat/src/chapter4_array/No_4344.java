package chapter4_array;

import java.io.*;

public class No_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {

			String[] inputStr = br.readLine().split(" ");
			int size = Integer.parseInt(inputStr[0]);
			double sum = 0.0;
			double average = 0.0;
			double overAverage = 0;

			// 원소들의 총 합계를 구하기 위한 반복
			for (int j = 1; j < inputStr.length; j++) {
				sum += Integer.parseInt(inputStr[j]);
			}

			average = sum / size;

			// 각 원소가 평균보다 높다면 overAverage를 증가 시키는 반
			for (int z = 1; z < inputStr.length; z++) {
				if (Integer.parseInt(inputStr[z]) > average) {
					overAverage++;
				}
			}

			System.out.printf("%.3f%%\n", overAverage / (double) size * 100);
		}
	}

}
