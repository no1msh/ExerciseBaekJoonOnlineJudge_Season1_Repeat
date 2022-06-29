package chapter09_recursive_function;

import java.io.*;

public class No_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.print(fibonacci(number));

    }

    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
