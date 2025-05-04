package 기초;

import java.util.ArrayList;
import java.util.Arrays;

public class ad제거하기 {
//    public String[] solution(String[] strArr) {
//        ArrayList<String> list = new ArrayList<>();
//
//        for (int i = 0; i < strArr.length; i++) {
//            if (!strArr[i].contains("ad")){
//                list.add(strArr[i]);
//            }
//        }
//
//        String[] answer = list.toArray(new String[0]);
//
//        answer = list.toArray(answer);
//        return answer;
//    }

    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(s -> !s.contains("ad"))
                .toArray(String[]::new);
    }
}

// 문자열 배열 strArr가 주어집니다.
// 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고
// 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.