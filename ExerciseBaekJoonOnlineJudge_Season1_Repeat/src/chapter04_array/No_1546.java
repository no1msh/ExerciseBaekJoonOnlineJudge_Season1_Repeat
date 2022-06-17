package chapter04_array;

import java.io.*;

public class No_1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] inputStr = br.readLine().split(" ");
		double[] gradeDouble = new double[n];
		double[] riggedGradeDouble = new double[n];

		double max = 0.0;
		double sum = 0.0;
		double result;

		for (int i = 0; i < inputStr.length; i++) {
			
			gradeDouble[i] = Double.parseDouble(inputStr[i]);

			if (gradeDouble[i] > max) {
				max = gradeDouble[i];
			}
		}

		for (int j = 0; j < riggedGradeDouble.length; j++) {
			
				riggedGradeDouble[j] = gradeDouble[j] / max * 100;
				sum += riggedGradeDouble[j];
		}

		result = sum / (double)n;

		System.out.print(result);
	}

}