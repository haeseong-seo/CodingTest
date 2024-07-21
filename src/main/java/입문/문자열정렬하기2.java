package 입문;

import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        String answer = "";

        // 문자열을 소문자로 변환
        String lowerCase = my_string.toLowerCase();

        // 문자 배열로 변환
        char[] chars = lowerCase.toCharArray();

        // 문자 배열 정렬
        Arrays.sort(chars);

        // 정렬한 문자 배열을 다시 문자열로 변환
        answer = new String(chars);

        return answer;
    }
}

// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
// my_string을 모두 소문자로 바꾸고
// 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.