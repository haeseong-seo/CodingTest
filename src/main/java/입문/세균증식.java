package 입문;

public class 세균증식 {
    public int solution(int n, int t) {
        // Math.pow(2, t) : 2의 t승으로 계산 -> double 타입이기 때문에 (int) 형변환
        int answer = n * (int) Math.pow(2, t);

        return answer;
    }
}
