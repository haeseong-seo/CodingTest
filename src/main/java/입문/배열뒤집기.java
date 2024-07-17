package 입문;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        // answer 을 num_list 의 길이만큼 크기를 가지도록 선언
        int[] answer = new int[num_list.length];

        // answer 배열의 마지막 위치부터 num_list 배열의 1번째 값을 담아 줌.
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list.length - i -1] = num_list[i];
        }

        return answer;
    }
}
