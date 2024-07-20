package 입문;

public class 가위바위보 {
    public String solution(String rsp) {
        String answer = "";
//      방법 1
        char scissors = '2';
        char rock = '0';
        char paper = '5';

        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == scissors) {
                answer += rock;
            } else if (rsp.charAt(i) == rock) {
                answer += paper;
            } else if (rsp.charAt(i) == paper) {
                answer += scissors;
            }
        }
        return answer;

        // 방법 2
//        String scissors = "2";
//        String rock = "0";
//        String paper = "5";
//
//        for(int i = 0; i < rsp.length(); i++){
//            String current = String.valueOf(rsp.charAt(i));
//            // current 변수를 사용한 이유
//            // 1. rsp 문자열에서 현재 인덱스 i에 있는 문자를 String 형태로 변환해 저장하려고
//            // 이유는 equals() 메소드를 사용해서 문자열 비교를 하려면
//            // 비교 대상이 모두 String 타입이어야 하기 때문
//            // valueOf()란?
//            // 자바의 기본 타입 값을 문자열(String)로 변환할 때 사용
//            // 래퍼 클래스나 String 클래스에서 제공
//            // String.valueOf()는 전달된 인자의 문자열 표현을 반환
//            // String.valueOf(rsp.charAt(i))는 rsp 문자열의 i번째 문자(char 타입)를
//            // String 타입 변환하는 데 사용
//
//            if(current.equals(scissors)){
//                // String 타입에서 값을 비교할 때는
//                // equals()를 사용하기에 equals90를 사용
//
//                answer += rock;
//
//            }else if(current.equals(rock)){
//
//                answer += paper;
//
//            }else if(current.equals(paper)){
//
//                answer += scissors;
//
//            }
//        }
//
//        return answer;
//        // 최종적으로 rsp를 모두 이기는 값들이 모여있게 된다.
    }
}


// 가위는 2 바위는 0 보는 5로 표현합니다.
// 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
// rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.