package chapter1_input_and_output_calculation;

import java.io.*;


public class No_18108 {

	static int diff = 2541- 1998;
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int bYear = Integer.parseInt(br.readLine());
		
		System.out.println(bYear-diff);
		
	}

}