package 입문;

import java.util.Arrays;

public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        // numbers를 오름차순으로 정렬
        Arrays.sort(numbers);

        int n = numbers.length;
        // 음수 입장에서는 배열의 0, 1 번째에 있는 값이 가장 크고
        int rest1 = numbers[0] * numbers[1];
        // 양수 입장에서는 배열의 n - 1, n -2에 있는 값이 가장 큼
        int rest2 = numbers[n - 1] * numbers[n - 2];

        // 삼항연산자로 비교해서 값을 출력
        return rest1 > rest2 ? rest1 : rest2;
    }
}
