package 입문;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 한번만등장문자 {
    public String solution(String s) {
        String answer = "";

        // 빈도수를 저장할 맵
        HashMap<String, Integer> map = new HashMap<>();

        // 문자열을 문자 단위로 분리하여 배열로 만들어 순환
        for (String str : s.split("")) {
            // 현재 문자의 빈도수를 얻고 없으면 기본 값 0을 사용한 뒤 1을 더해서 저장
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        // list에 맵에서 저장한 키값을 저장
        List<String> list = new ArrayList<>(map.keySet());
        // 사전 순으로 정렬
        list.sort(String::compareTo);
        // 정렬한 list를 순회하면서 빈도수가 1인 문자인지 확인
        for (String str : list) {
            // 맞다면 answer에 추가
            if (map.get(str) == 1) {
                answer += str;
            }
        }

        return answer;
    }
}


// 문자열 s가 매개변수로 주어집니다.
// s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
// 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.