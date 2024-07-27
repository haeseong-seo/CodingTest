package 입문;

import java.util.ArrayList;

public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i+=n) {
            // i + n : 문자열을 자를 끝 인덱스
            // i + n 과 my_str.length 중 작은 값을 end 로 설정
            // 만약 i + n이 문자열의 길이를 넘어가는 경우 end 는 문자열의 길이로 설정되어 인덱스 오류를 방지
            int end = Math.min(i+n, my_str.length());
            // i ~ end 까지의 부분 문자열을 잘라서 추가
            list.add(my_str.substring(i, end));
        }

        // toArray 를 통해 ArrayList 를 문자열 배열로 변환
        return list.toArray(new String[0]);
    }
}

// 문자열 my_str과 n이 매개변수로 주어질 때,
// my_str을 길이 n씩 잘라서
// 저장한 배열을 return하도록 solution 함수를 완성해주세요.