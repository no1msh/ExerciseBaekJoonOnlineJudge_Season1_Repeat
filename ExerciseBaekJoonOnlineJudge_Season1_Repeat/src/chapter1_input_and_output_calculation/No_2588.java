package chapter1_input_and_output_calculation;

import java.io.*;

public class No_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println(a*(b%10)); // num2의 1의자리만 남기고 num1과 곱함.
		System.out.println(a*(b%100/10)); // num2의 10의 자리만 남기고 num1과 곱함.
		System.out.println(a*(b/100));	// num2의 100의자리만 남기고 num1과 곱함 
		System.out.print(a*b);

	}

}