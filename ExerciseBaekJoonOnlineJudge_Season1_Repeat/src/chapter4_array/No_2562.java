package chapter4_array;

import java.io.*;

public class No_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int index = 0;

		for (int i = 0; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());

			if (n > max) {
				max = n;
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.print(index+1);
	}

}
