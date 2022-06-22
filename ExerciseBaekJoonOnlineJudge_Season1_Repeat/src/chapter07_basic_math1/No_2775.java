package chapter07_basic_math1;

import java.io.*;

public class No_2775 {

    static int findRoomPeople(int floor , int num){

        int result = 0;

        if (floor == 0){
            return num;
        } else {
            for (int i = num ; i > 0 ; i--){
                result += findRoomPeople(floor-1 , i);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0){
            int floor = Integer.parseInt(br.readLine());
            int roomNumber = Integer.parseInt(br.readLine());

            System.out.println(findRoomPeople(floor , roomNumber));
        }
    }
}