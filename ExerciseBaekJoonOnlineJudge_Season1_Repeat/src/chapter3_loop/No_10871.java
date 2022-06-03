package chapter3_loop;

import java.io.*;

public class No_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputStr = br.readLine().split(" ");
		
		int n = Integer.parseInt(inputStr[0]);
		int x = Integer.parseInt(inputStr[1]);
		
		String[] inputNumArray = br.readLine().split(" ");
		
		for (int i = 0; i < inputNumArray.length; i++) {
			if ( x > Integer.parseInt(inputNumArray[i])) {
				System.out.print(inputNumArray[i]+" ");
			}
		}
	}

}