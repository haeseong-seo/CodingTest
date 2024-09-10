package 기초;

public class 문자열여러번뒤집기 {
    public String solution(String my_string, int[][] queries) {
        String answer = "";

        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            if (s >= 0 && e < sb.length() && s <= e) {
                StringBuilder subStr = new StringBuilder(sb.substring(s, e + 1));
                subStr.reverse();

                sb.replace(s, e + 1, subStr.toString());
            }
        }

        answer = sb.toString();

        return answer;
    }
}

// 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
// queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
// my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.