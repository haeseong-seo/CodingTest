package 기초;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int product = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            product *= num_list[i];
        }

        if (product < sum * sum){
            answer = 1;
        }

        return answer;
    }
}

// 정수가 담긴 리스트 num_list가 주어질 때,
// 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을
// 크면 0을 return하도록 solution 함수를 완성해주세요.