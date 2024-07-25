package 입문;

public class 문자열계산하기 {
    public int solution(String my_string) {
        int answer = 0;

        // 공백을 기준으로 분리해 저장
        String[] s = my_string.split(" ");

        // 1번째 숫자를 answer에 저장
        answer = Integer.valueOf(s[0]);

        // 1번째 값은 이미 있고 2번째 값은 연산자 임으로 int i = 1부터 순회
        for (int i = 1; i < s.length; i++) {
            // 만약 연산자가 + 라면 2번째 인덱스 값과 1번째에 저장되어 있는 answer을 더함
            if (s[i].equals("+")){
                answer += Integer.valueOf(s[i + 1]);
                // 만약 - 라면 반대로 진행
            }else if (s[i].equals("-")){
                answer -= Integer.valueOf(s[i + 1]);
            }
        }

        return answer;
    }
}

// my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
// 문자열 my_string이 매개변수로 주어질 때,
// 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.