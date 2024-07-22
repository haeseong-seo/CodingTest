package 입문;

public class 공던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = numbers.length;

        for (int i = 1; i < k; i++) {
            answer = (answer + 2) % n;  // 한 명 건너 뛰기
        }

        // k번째 공을 던지는 사람의 번호
        return numbers[answer];
    }
}
