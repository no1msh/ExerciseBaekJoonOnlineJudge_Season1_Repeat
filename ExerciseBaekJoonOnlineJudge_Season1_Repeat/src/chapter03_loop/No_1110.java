package chapter03_loop;

import java.io.*;

public class No_1110 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int initNum = Integer.parseInt(br.readLine());
		int n = initNum;
		int count = 1;
		int left, right;

		while (true) {

			left = n / 10;
			right = n % 10;

			n = right * 10 + (left + right) % 10;

			if (initNum == n) {
				break;
			}

			count++;

		}

		System.out.print(count);

	}

}
