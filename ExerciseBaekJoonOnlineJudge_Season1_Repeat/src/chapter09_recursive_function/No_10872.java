package chapter09_recursive_function;

import java.io.*;

public class No_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        System.out.print(factorial(number));

    }

    public static int factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
