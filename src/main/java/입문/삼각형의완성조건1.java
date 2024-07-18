package 입문;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    public int solution(int[] sides) {
        int answer = 0;

        // sides를 오름차순으로 정렬
        Arrays.sort(sides);

        // 가장 긴 변의 길이와 나머지 두 변의 길이를 변수에 저장
        int a1 = sides[0];
        int a2 = sides[1];
        int a3 = sides[2];


        if (a3 < a1 + a2){
            answer = 1;
        }else {
            answer = 2;
        }

        return answer;
    }
}
