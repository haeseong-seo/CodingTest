package 입문;

import java.util.Arrays;

public class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        int min = sides[0];
        int max = sides[1];

        // a + b > c
        // b 가 가장 긴 변인 경우
        for (int i = max - min + 1; i <= max; i++) {
            answer++;
        }

        // c 가 제일 긴 변인 경우
        for (int i = max + 1; i < min + max; i++) {
            answer++;
        }

        return answer;
    }
}
