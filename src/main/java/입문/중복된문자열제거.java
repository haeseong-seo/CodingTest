package 입문;

import java.util.LinkedHashSet;
import java.util.Set;

public class 중복된문자열제거 {
    public String solution(String my_string) {
//        String answer = "";
//
//        Set<Character> set = new LinkedHashSet<>();
//
//        for (int i = 0; i < my_string.length(); i++) {
//            set.add(my_string.charAt(i));
//        }
//
//        // set에 저장된 문자를 문자열로 변환
//        StringBuilder sb = new StringBuilder();
//        for (Character c : set) {
//            sb.append(c);
//        }
//        answer = sb.toString();
//
//        return answer;

        // 방법 2
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (i == my_string.indexOf(my_string.charAt(i))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
