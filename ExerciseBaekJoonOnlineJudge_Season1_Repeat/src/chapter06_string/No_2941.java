package chapter06_string;

import java.io.*;

public class No_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int count = inputStr.length();

        for (int i = 0; i < inputStr.length() - 1; i++) {

            if (inputStr.charAt(i) == 'c') {
                if (inputStr.charAt(i + 1) == '=') {
                    count--;
                } else if (inputStr.charAt(i + 1) == '-') {
                    count--;
                }

            } else if (inputStr.charAt(i) == 'd') {
                if (inputStr.charAt(i + 1) == 'z') {
                    if ((i + 2) < inputStr.length()) {
                        if (inputStr.charAt(i + 2) == '=') {
                            count -= 2;
                        }
                    }
                } else if (inputStr.charAt(i + 1) == '-') {
                    count--;
                }
            } else if (inputStr.charAt(i) == 'l') {
                if (inputStr.charAt(i + 1) == 'j') {
                    count--;
                }
            } else if (inputStr.charAt(i) == 'n') {
                if (inputStr.charAt(i + 1) == 'j') {
                    count--;
                }
            } else if (inputStr.charAt(i) == 's') {
                if (inputStr.charAt(i + 1) == '=') {
                    count--;
                }
            } else if (inputStr.charAt(i) == 'z') {
                if (inputStr.charAt(i + 1) == '=') {
                    if (0 <= i - 1) {
                        if (inputStr.charAt(i - 1) == 'd') {
                            continue;
                        }
                    }
                    count--;
                }
            }

        }
        System.out.print(count);
    }
}
