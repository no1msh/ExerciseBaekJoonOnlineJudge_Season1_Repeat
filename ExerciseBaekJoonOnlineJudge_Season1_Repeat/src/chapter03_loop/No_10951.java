package chapter03_loop;

import java.io.*;

public class No_10951 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = "";

		while ((inputStr = br.readLine()) != null) {
			
			String[] inputNum = inputStr.split(" ");

			int a = Integer.parseInt(inputNum[0]);
			int b = Integer.parseInt(inputNum[1]);

			System.out.println(a + b);
		}
	}

}
