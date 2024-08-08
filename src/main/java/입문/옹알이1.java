package 입문;

public class 옹알이1 {
    public int solution(String[] babbling) {
//        방법1
//        int answer = 0;
//
//        String[] validWords = {"aya", "ye", "woo", "ma"};
//
//        for (String word : babbling) {
//            // 발음 할 수 있는 단어로만 구성된 경우인지 확인
//            for (String valid : validWords){
//                word = word.replace(valid, " ");
//            }
//
//            // 공백만 남으면 발음할 수 있는 단어이다.
//            if (word.trim().isEmpty()){
//                answer++;
//            }
//        }
//        return answer;

        // 방법2
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            // matches : 문자열이 특정 정규 표현식에 맞는지 확인 (boolean)
            // ?! : 부정적 전방탐색으로 특정 패턴이 뒤따라오는 것을 방지
            // aya 또는 ye 또는 woo 또는 ma 중 한 개
            // + : 앞의 패턴이 한 번 이상 반복되는 것을 의미
            if (babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
                answer++;
            }
        }
        return answer;
    }
}

// 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
// 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을
// 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.