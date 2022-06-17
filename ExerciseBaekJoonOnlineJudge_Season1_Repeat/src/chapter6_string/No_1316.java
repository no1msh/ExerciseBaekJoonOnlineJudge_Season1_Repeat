package chapter6_string;

import java.io.*;
import java.util.ArrayList;

public class No_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int groupCount = testCase;

        for (int i = 0; i < testCase; i++) {
            String inputString = br.readLine();
            ArrayList<Character> usedAlphabet = new ArrayList<>();

            if (inputString.length() < 3){
                continue;
            }

            for (int j = 1 ; j < inputString.length(); j++ ){
                if (usedAlphabet.contains(inputString.charAt(j))){
                    groupCount--; // 이번 인덱스에 해당하는 char가 이미 배열에 있으면 그룹단어가 아님.
                    break;
                } else if (inputString.charAt(j-1) == inputString.charAt(j)) {
                    continue; // 바로 전 char와 이번 인덱스의 char가 같다면 다음 인덱스로 넘어감.
                } else { // 바로 전 인덱스의 char와 이번 인덱스의 char가 같지 않고 사용된 알파벳 배열에 없다면 추가.
                    usedAlphabet.add(inputString.charAt(j-1));
                }
            }
        }

        System.out.print(groupCount);

    }
}
