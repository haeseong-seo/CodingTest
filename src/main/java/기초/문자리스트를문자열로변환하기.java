package 기초;

public class 문자리스트를문자열로변환하기 {
    public String solution(String[] arr) {
        String answer = "";

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            answer += arr[i];
        }
        return answer;
    }
}

// 문자들이 담겨있는 배열 arr가 주어집니다.
// arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.