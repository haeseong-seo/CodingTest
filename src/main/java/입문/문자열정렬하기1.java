package 입문;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public int[] solution(String my_string) {
        // 숫자가 아닌 문자를 모두 제거
        my_string = my_string.replaceAll("[^0-9]", "");

        // 숫자 문자열을 하나씩 분리하여 배열로 변환
        String [] arr = my_string.split("");
        int[] answer = new int[arr.length];

        // 배열의 길이만큼 반복하며 문자열을 정수로 반환해 answer 에 저장
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}


// 문자열 my_string이 매개변수로 주어질 때,
// my_string 안에 있는 숫자만 골라
// 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.