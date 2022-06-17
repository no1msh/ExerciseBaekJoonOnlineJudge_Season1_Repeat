package chapter03_loop;

import java.io.*;

public class No_2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}

}
