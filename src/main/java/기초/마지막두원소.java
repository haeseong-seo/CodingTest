package 기초;

public class 마지막두원소 {
    public int[] solution(int[] num_list) {
        int length = num_list.length;

        int last = num_list[length - 1];
        int secondLast = num_list[length - 2];

        int[] answer = new int[length + 1];

        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }

        if (last > secondLast) {
            answer[length] = last - secondLast;
        }else {
            answer[length] = last * 2;
        }

        return answer;
    }
}

// 정수 리스트 num_list가 주어질 때,
// 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가
// 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.