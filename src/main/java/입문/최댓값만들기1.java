package 입문;

import java.util.Arrays;

public class 최댓값만들기1 {
    public int solution(int[] numbers) {
        // 오름차순으로 정렬
        Arrays.sort(numbers);

        // 마지막 값과 마지막 - 1인덱스를 곱함
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
