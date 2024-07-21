package 입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 약수구하기 {
    public int[] solution(int n) {

        List<Integer> divisors = new ArrayList<>();

        // n의 약수를 찾는 반복문
        for (int i = 1; i <= n; i++) {
            // i가 n의 약수이면
            if (n % i == 0){
                divisors.add(i);
            }
        }

        int[] answer = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            answer[i] = divisors.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}

// 정수 n이 매개변수로 주어질 때,
// n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.