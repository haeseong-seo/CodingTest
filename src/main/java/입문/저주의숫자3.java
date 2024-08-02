package 입문;

public class 저주의숫자3 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            // 일단  answer 에 1을 더함
            answer++;
            // 3의 배수이거나 3을 포함하고 있으면 answer을 그 다음 숫자로 넘어감
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }

        return answer;
    }
}

// 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에
// 3의 배수와 숫자 3을 사용하지 않습니다.
// 3x 마을 사람들의 숫자는 다음과 같습니다.