package chapter2_if;

import java.io.*;

public class No_2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = br.readLine().split(" ");
		int hour, minute, needTime;
		
		hour = Integer.parseInt(inputStr[0]);
		minute = Integer.parseInt(inputStr[1]);
		needTime = Integer.parseInt(br.readLine());
		
		if ( minute + needTime < 60) {
			minute += needTime;
			
		} else {
			hour += (minute + needTime) / 60;
			minute = (minute + needTime) % 60;
			if (hour > 23) {
				hour = hour % 24;
			}

		}
		
		System.out.println(hour + " " + minute);
		
	}

}
