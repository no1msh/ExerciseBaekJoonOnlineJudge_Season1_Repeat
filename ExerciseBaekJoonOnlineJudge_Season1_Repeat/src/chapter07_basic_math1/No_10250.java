package chapter07_basic_math1;

import java.io.*;

public class No_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String[] inputString = br.readLine().split(" ");
            int height = Integer.parseInt(inputString[0]);
            int width = Integer.parseInt(inputString[1]);
            int roomNumber = Integer.parseInt(inputString[2]);

            int frontRoomNumber;
            int rearRoomNumber;

            if (roomNumber % height == 0 ){
                frontRoomNumber = height;
                rearRoomNumber = roomNumber / height;
            } else {
                frontRoomNumber = roomNumber % height;
                rearRoomNumber = roomNumber / height + 1 ;
            }

            System.out.printf("%d%02d\n", frontRoomNumber , rearRoomNumber);

        }
    }
}
