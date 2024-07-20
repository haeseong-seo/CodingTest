package 입문;

public class 배열회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];

        if (direction.equals("right")) {
            // 마지막 원소를 1번째 자리로 이동
            answer[0] = numbers[n - 1];
            // 나머지 원소들도 한칸씩 오른쪽으로 이동
            for (int i = 1; i < n; i++) {
                answer[i] = numbers[i - 1];
            }
        }else {
            // 첫 번째 원소를 마지막 위치로 이동
            answer[n - 1] = numbers[0];
            // 나머지 원소들도 한 칸씩 왼쪽으로 이동
            for (int i = 0; i < n - 1; i++){
                answer[i] = numbers[i + 1];
            }
        }

        return answer;
    }
}

// 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
// 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.