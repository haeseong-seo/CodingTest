package 입문;

import java.awt.*;

public class 영어가싫어요 {
    public long solution(String numbers) {
        long answer = 0;

        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num  = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < word.length; i++) {
            numbers = numbers.replaceAll(word[i], num[i]);
        }
        answer = Long.parseLong(numbers);

        return answer;
    }
}

// numbers는 소문자로만 구성되어 있습니다.
// numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
// 1 ≤ numbers의 길이 ≤ 50
// "zero"는 numbers의 맨 앞에 올 수 없습니다.