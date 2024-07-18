package 입문;

public class 문자열뒤집기 {
    public String solution(String my_string) {
        StringBuilder builder = new StringBuilder(my_string);
        return builder.reverse().toString();
    }
}
