package chapter07_basic_math1;

import java.io.*;

public class No_1193 {

    static int fibonacci(int num) {
        if (num <= 1) {
            return 1;
        }

        return num + fibonacci(num - 1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(br.readLine());
        int fiboIndex = 1;
        int fiboIndexMax = fiboIndex + 1;
        int x, y;

        if (inputNumber == 1) {
            System.out.print("1/1");
            return;
        }

        while (true) {
            if (fibonacci(fiboIndex) < inputNumber && inputNumber <= fibonacci(fiboIndexMax)) {
                break;
            } else {
                fiboIndex++;
                fiboIndexMax++;
            }
        }

        if (fiboIndexMax % 2 == 0) {
            x = 1;
            y = fiboIndexMax;
        } else {
            x = fiboIndexMax;
            y = 1;
        }

        for (int i = 1; i < inputNumber - fibonacci(fiboIndex); i++) {
            if (fiboIndexMax % 2 == 0) {
                x += 1;
                y -= 1;
            } else {
                x -= 1;
                y += 1;
            }
        }

        System.out.print(x + "/" + y);
    }
}
