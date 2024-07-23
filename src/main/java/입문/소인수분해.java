package 입문;

import java.util.ArrayList;
import java.util.Arrays;

public class 소인수분해 {
    public int[] solution(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        // 2 ~ n까지의 수로 나누어 소인수를 찾음
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!factors.contains(i)) {
                    factors.add(i); // 소인수 추가
                }
                n /= i; // n을 i로 나누어 소인수를 계속 찾기
            }
        }
        // list를 배열로 변환
        int[] answer = new int[factors.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = factors.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}

// 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
// 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
// 따라서 12의 소인수는 2와 3입니다.
// 자연수 n이 매개변수로 주어질 때
// n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.