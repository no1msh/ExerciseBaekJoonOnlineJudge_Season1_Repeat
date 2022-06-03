package chapter4_array;

import java.io.*;

public class No_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] inputStr = br.readLine().split(" ");
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n ; i++) {
			if (Integer.parseInt(inputStr[i]) > max) {
				max = Integer.parseInt(inputStr[i]);
			} 
			if (Integer.parseInt(inputStr[i]) < min) {
				min = Integer.parseInt(inputStr[i]);
			}
		}
		
		System.out.print(min + " " + max);
		
	}

}
