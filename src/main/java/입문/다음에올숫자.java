package 입문;

public class 다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;

        // 첫 번째와 두 번째 원소의 차이로 등차수열을 판단
        int diff = common[1] - common[0];

        // 첫 번째와 두 번째 원소의 비율로 등비수열을 판단
        double ratio = common[1] / common[0];

        // 등차수열인지 확인
        if (common[2] - common[1] == diff) {
            // 다음 원소는 등차수열의 차이를 더한 값
            answer = common[common.length - 1] + diff;
        }
        // 등비수열인지 확인
        else if ((double)common[2] / common[1] == ratio) {
            // 다음 원소는 등비수열의 비율을 곱한 값
            answer = (int)(common[common.length - 1] * ratio);
        }

        return answer;
    }
}

// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
// 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.