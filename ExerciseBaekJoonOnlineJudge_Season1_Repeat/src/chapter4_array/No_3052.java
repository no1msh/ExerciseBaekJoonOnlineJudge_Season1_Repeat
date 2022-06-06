package chapter4_array;

import java.io.*;
import java.util.ArrayList;

public class No_3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] inputNum = new int[10];
		ArrayList<Integer> modResult = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			inputNum[i] = Integer.parseInt(br.readLine());
			
			if (!modResult.contains(inputNum[i] % 42)) {
				modResult.add(inputNum[i] % 42);
			}
		}

		System.out.print(modResult.size());

	}

}