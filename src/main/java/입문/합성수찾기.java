package 입문;

public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n까지의 자연수 중 합성수 개수 찾는 반복문
        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            // count의 개수가 3개 이상이면 합성수
            if (count >= 3){
                answer++;
            }
        }

        return answer;
    }
}

// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
// 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를
// return하도록 solution 함수를 완성해주세요.