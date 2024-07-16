package 입문;

import java.util.Arrays;

public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length];

        // Arrays.copyOfRange(원본배열, from, to))
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        return answer;
    }
}
