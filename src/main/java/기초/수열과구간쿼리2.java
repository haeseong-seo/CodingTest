package 기초;

public class 수열과구간쿼리2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];  // 시작 인덱스
            int e = queries[q][1];  // 끝 인덱스
            int k = queries[q][2];  // 기준 인덱스

            // 초기 최소값을 최댓값으로 설정
            int minValue = Integer.MAX_VALUE;
            boolean found = false;

            // 시작 값은 s이고 끝 값인 e가 될 때까지 순회
            for (int i = s; i <= e; i++) {
                // 만약 arr[i]가 k보다 클 경우
                if (arr[i] > k) {
                    if (arr[i] < minValue) {
                        minValue = arr[i];
                        found = true;
                    }
                }
            }
            // answer[q] 값이 true 이면 초기 최소값이 들어가고 아닌 경우 -1을 넣음
            answer[q] = found ? minValue : -1;
        }
        return answer;
    }
}

// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
// queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//
//각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.