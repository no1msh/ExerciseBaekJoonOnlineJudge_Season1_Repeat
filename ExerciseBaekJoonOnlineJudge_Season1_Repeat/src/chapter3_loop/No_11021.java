package chapter3_loop;

import java.io.*;

public class No_11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caseNum = 1;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] inputStr = br.readLine().split(" ");

			int a = Integer.parseInt(inputStr[0]);
			int b = Integer.parseInt(inputStr[1]);
			
			sb.append("Case #"+caseNum+": "+(a+b)+"\n");
			caseNum++;
		}
		
		System.out.print(sb.toString());

	}

}