package chapter03_loop;

import java.io.*;

public class No_10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			String[] inputNum = br.readLine().split(" ");
			int a = Integer.parseInt(inputNum[0]);
			int b = Integer.parseInt(inputNum[1]);
			
			System.out.println(a+b);
		}
	}

}
