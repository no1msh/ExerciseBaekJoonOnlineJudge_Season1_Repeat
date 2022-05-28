package chapter3_loop;

import java.io.*;

public class No_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] inputNumStr = br.readLine().split(" ");

			int a = Integer.parseInt(inputNumStr[0]);
			int b = Integer.parseInt(inputNumStr[1]);

			int sum = a + b;

			bw.write(sum + "\n");
		}

		bw.flush();
		bw.close();
	}

}
