package 기초;

import java.util.ArrayList;
import java.util.List;

public class 카운트업 {
    public int[] solution(int start_num, int end_num) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            numbers.add(i);
        }

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }

        return answer;
    }
}

// 정수 start_num와 end_num가 주어질 때,
// start_num부터 end_num까지의 숫자를 차례로 담은 리스트를
// return하도록 solution 함수를 완성해주세요.