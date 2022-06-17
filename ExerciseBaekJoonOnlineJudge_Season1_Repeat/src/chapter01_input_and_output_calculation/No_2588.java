package chapter01_input_and_output_calculation;

import java.io.*;

public class No_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println(a*(b%10)); // num2�� 1���ڸ��� ����� num1�� ����.
		System.out.println(a*(b%100/10)); // num2�� 10�� �ڸ��� ����� num1�� ����.
		System.out.println(a*(b/100));	// num2�� 100���ڸ��� ����� num1�� ���� 
		System.out.print(a*b);

	}

}