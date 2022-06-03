package chapter3_loop;

import java.io.*;

public class No_10952 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String[] inputStr = br.readLine().split(" ");
			
			int a = Integer.parseInt(inputStr[0]);
			int b = Integer.parseInt(inputStr[1]);
			
			if (a == 0 && b== 0) {
				break;
			}
			
			System.out.println(a+b);
			
		}
	}

}