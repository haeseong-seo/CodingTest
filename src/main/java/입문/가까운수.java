package 입문;

import java.util.Arrays;

public class 가까운수 {
    public int solution(int[] array, int n) {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            // Math.abs(n - array[0]) : 현재까지 가장 가까운수와 n 사이의 절대 거리
            // Math.abs(n - array[i]) : array[i]와 n 사이의 절대 거리
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }
        answer = array[0];

        return answer;
    }
}

// 정수 배열 array와 정수 n이 매개변수로 주어질 때,
// array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.