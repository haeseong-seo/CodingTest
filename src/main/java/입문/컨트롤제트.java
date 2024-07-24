package 입문;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;

        // s를 공백을 기준으로 나눔
        String[] word = s.split(" ");
        // 직전의 숫자를 저장할 변수
        int last = 0;

        for (String element : word) {
            if (element.equals("Z")){
                answer -= last;
            }else {
                // 다음 값으로 숫자를 만나면 더하기
                int number = Integer.parseInt(element);
                answer +=number;
                last = number;      // 직전 숫자 업데이트
            }
        }

        return answer;
    }
}
