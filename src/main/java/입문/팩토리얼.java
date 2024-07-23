package 입문;

public class 팩토리얼 {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            // i! 계산
            factorial *= i;

            // factorial 값이 n을 넘으면 멈춤
            if (factorial > n){
                break;
            }
            // 조건에 만족하는 가장 큰 i 출력
            answer = i;
        }
        return answer;
    }
}


// i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
// 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때
// 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
//
//i! ≤ n