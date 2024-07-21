package 입문;

public class 숫자찾기 {
    public int solution(int num, int k) {
        // num 안에 k가 없으면 기본 반환 값인 -1로 초기화
        int answer = -1;

        String number = Integer.toString(num);

        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i) == (char) (k + '0')){
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
