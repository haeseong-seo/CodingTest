package 입문;

public class 대문자와소문자 {
    public String solution(String my_string) {
        char a;
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            a = my_string.charAt(i);
            if (Character.isUpperCase(a)) {
                answer += Character.toLowerCase(a);
            }else {
                answer += Character.toUpperCase(a);
            }
        }

        return answer;
    }
}
