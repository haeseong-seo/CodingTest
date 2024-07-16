package 입문;

public class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int answer = 0;

        // 알파벳제거
        my_string = my_string.replaceAll("[a-zA-Z]", "");

        // 공백을 기준으로 나눔
        String[] string = my_string.split("");

        for (String i : string){
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}
