package chapter07_basic_math1;

import java.io.*;

public class No_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStringArray = br.readLine().split(" ");

        int aFixedExpense = Integer.parseInt(inputStringArray[0]);
        int bVariableExpense = Integer.parseInt(inputStringArray[1]);
        int cPrice = Integer.parseInt(inputStringArray[2]);
        int result;

        if (bVariableExpense >= cPrice) {
            System.out.print(-1);
            return;
        }

        result = aFixedExpense / (cPrice - bVariableExpense);

        System.out.print(result + 1);
    }
}
