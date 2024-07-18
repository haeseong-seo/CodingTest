package 입문;

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] chars = my_string.toCharArray();

        char temp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = temp;

        return new String(chars);
    }
}
