package chapter2_if;

import java.io.*;

public class No_2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputStr = br.readLine().split(" ");

		int H = Integer.parseInt(inputStr[0]);
		int M = Integer.parseInt(inputStr[1]);

		if (M - 45 < 0) {
			H--;
			if (H < 0) {
				H = 23;
			}
			M = 60 - (45 - M);
		} else {
			M = M - 45;
		}

		System.out.println(H + " " + M);
	}

}
