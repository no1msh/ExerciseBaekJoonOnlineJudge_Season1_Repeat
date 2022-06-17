package chapter04_array;

import java.io.*;

public class No_8958 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {

			String inputResult = br.readLine();
			int combo = 1;
			int score = 0;

			for (int j = 0; j < inputResult.length(); j++) {

				if (inputResult.charAt(j) == 'O') {
					score += combo;
					combo++;
					
				} else {
					combo = 1;
				}

			}
			System.out.println(score);
		}

	}

}
