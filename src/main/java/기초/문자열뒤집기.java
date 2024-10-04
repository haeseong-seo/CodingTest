package 기초;

public class 문자열뒤집기 {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        // 시작 인덱스 s부터 끝 인덱스 e까지를 가져오기 위해 e+1 사용
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse(); // 부분 문자열 뒤집기

        // 뒤집은 부분 문자열을 원래 문자열에 합쳐서 최종 결과 생성
        answer = my_string.substring(0, s) + sb.toString() + my_string.substring(e + 1);

        return answer;
    }
}

// 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
// my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.