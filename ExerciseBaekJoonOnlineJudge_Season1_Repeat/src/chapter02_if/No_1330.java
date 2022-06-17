package chapter02_if;

import java.io.*;

public class No_1330 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputStr = br.readLine().split(" ");
		
		int a = Integer.parseInt(inputStr[0]);
		int b = Integer.parseInt(inputStr[1]);
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}

}
