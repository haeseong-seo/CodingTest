package 기초;

import java.util.ArrayList;

public class 배열만들기1 {
    public int[] solution(int n, int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//            if (i % k == 0) {
//                list.add(i);
//            }
//        }
//
//        int[] answer = new int[list.size()];
//
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//
//        return answer;

        int count = n / k;

        int[] answer = new int[count];

        for (int i = 1; i <= count; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }
}
// 정수 n과 k가 주어졌을 때,
// 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
