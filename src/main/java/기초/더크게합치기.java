package 기초;

public class 더크게합치기 {
    public int solution(int a, int b) {
        String num1 = String.valueOf(a) + String.valueOf(b);
        String num2 = String.valueOf(b) + String.valueOf(a);

        int result1 = Integer.parseInt(num1);
        int result2 = Integer.parseInt(num2);

        return Math.max(result1, result2);
    }
}

// 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
// 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.