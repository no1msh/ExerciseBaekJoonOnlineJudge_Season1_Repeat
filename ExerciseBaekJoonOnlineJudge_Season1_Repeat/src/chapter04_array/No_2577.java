package chapter04_array;

import java.io.*;

public class No_2577 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int result = a * b * c;
		
		String resultStr = String.valueOf(result);
		
		char[] numCharArr = {'0','1','2','3','4','5','6','7','8','9'};
		
		for (int i = 0 ; i < numCharArr.length; i++) {
			int count = 0;
			
			for (int j = 0 ; j < resultStr.length(); j++) {
				if (numCharArr[i] == resultStr.charAt(j)) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
		
		
	}

}
