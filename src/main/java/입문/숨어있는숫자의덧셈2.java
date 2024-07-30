package 입문;

public class 숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;

        String number = my_string.replaceAll("[a-zA-Z]", " ");

        for (String num : number.trim().split(" ")) {
            if (!num.isEmpty()) {       // 공백 문자열 무시
                answer += Integer.parseInt(num);
            }
        }

        return answer;
    }
}

// 문자열 my_string이 매개변수로 주어집니다.
// my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
// my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.