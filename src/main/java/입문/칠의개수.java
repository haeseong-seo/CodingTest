package 입문;

import java.util.Arrays;

public class 칠의개수 {
    public int solution(int[] array) {
        int answer = 0;

        String seven = Arrays.toString(array);

        for (int i = 0; i < seven.length(); i++) {
            if (seven.charAt(i) == '7') {
                answer++;
            }
        }

        return answer;
    }
}

// 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
// 정수 배열 array가 매개변수로 주어질 때,
// 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.