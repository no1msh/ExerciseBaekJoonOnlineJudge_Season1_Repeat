package chapter01_input_and_output_calculation;

import java.io.*;

public class No_10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputStr = br.readLine().split(" ");
		
		int a = Integer.parseInt(inputStr[0]);
		int b = Integer.parseInt(inputStr[1]);
		int c = Integer.parseInt(inputStr[2]);
		
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
	}

}
