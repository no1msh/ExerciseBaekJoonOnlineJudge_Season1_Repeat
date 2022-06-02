package chapter3_loop;

import java.io.*;

public class No_2439 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int starCount = 1;

		while (starCount <= t) {
			for (int i = t - starCount; i > 0; i--) {
				System.out.print(" ");
			}

			for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			System.out.println();
			starCount++;
		}

	}

}