package 기초;

public class 이어붙인수 {
    public int solution(int[] num_list) {
        int answer = 0;

        StringBuilder oddNumber = new StringBuilder();
        StringBuilder evenNumber = new StringBuilder();

        for (int num : num_list){
            if (num % 2 == 0) {
                oddNumber.append(num);
            }else {
                evenNumber.append(num);
            }
        }

        int oddNum = oddNumber.length() > 0 ? Integer.parseInt(oddNumber.toString()) : 0;
        int evenNm = evenNumber.length() > 0 ? Integer.parseInt(evenNumber.toString()) : 0;

        answer = oddNum + evenNm;

        return answer;
    }
}

// 정수가 담긴 리스트 num_list가 주어집니다.
// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.