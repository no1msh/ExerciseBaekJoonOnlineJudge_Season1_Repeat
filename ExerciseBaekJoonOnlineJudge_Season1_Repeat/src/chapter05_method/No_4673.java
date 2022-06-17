package chapter05_method;

public class No_4673 {

    static int drFunc(int num) {

        int inputNum = num;
        int result = num;

        while (true) {
            result += inputNum % 10;
            inputNum /= 10;

            if (inputNum < 10) {
                result += inputNum;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        boolean[] isSelfNumArr = new boolean[10001];

        for (int i = 1; i < isSelfNumArr.length; i++) {
            if (drFunc(i) <= 10000)
                isSelfNumArr[drFunc(i)] = true;

        }

        for (int j = 1; j < isSelfNumArr.length; j++) {
            if (!isSelfNumArr[j]) {
                System.out.println(j);
            }
        }

    }
}
