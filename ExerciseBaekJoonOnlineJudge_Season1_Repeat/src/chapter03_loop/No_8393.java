package chapter03_loop;

import java.io.*;

public class No_8393 {

	static int func(int n) {
		
		if (n == 1) {
			return 1;
		}
		return n + func(n-1);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(func(n));
	}

}
