package chapter2_if;

import java.io.*;

public class No_2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = br.readLine().split(" ");

		int dice1 = Integer.parseInt(inputStr[0]);
		int dice2 = Integer.parseInt(inputStr[1]);
		int dice3 = Integer.parseInt(inputStr[2]);

		int high;
		int same;

		if (dice1 > dice2 && dice1 > dice3) {
			high = dice1;
		} else if (dice2 > dice1 && dice2 > dice3) {
			high = dice2;
		} else {
			high = dice3;
		}

		if (dice1 == dice2 && dice2 == dice3) {
			System.out.println(dice1 * 1000 + 10000);
		} else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
			if (dice1 == dice2) {
				same = dice1;
			} else if (dice1 == dice3) {
				same = dice1;
			} else {
				same = dice2;
			}
			
			System.out.println(same * 100 + 1000);
		} else {
			System.out.println(high * 100);
		}

	}

}
