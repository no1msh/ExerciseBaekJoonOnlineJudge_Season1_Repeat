package chapter08_basic_math2;

import java.io.*;

public class No_1978 {

    static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        for (int i = 2; i <= num/2 ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        String[] inputString = br.readLine().split(" ");
        int count = 0;

        for (int i = 0 ; i < inputString.length ; i++){
            if (isPrime(Integer.parseInt(inputString[i]))){
                count++;
            }
        }

        System.out.print(count);
    }
}
