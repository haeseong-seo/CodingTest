package 입문;

import java.util.Collections;
import java.util.stream.Collectors;

public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        String answer = "";
//         방법 1
//        char word = letter.charAt(0);
//
//        answer = my_string.chars()
//                .filter(c -> c != word)
//                .mapToObj(c -> String.valueOf((char)c))
//                .collect(Collectors.joining());
//
//        return answer;

//        방법 2
        answer = my_string.replace(letter, "");
        return answer;
    }
}
