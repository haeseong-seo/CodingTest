package 기초;

public class 코드처리하기 {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder(); // 문자열을 효율적으로 조작하기 위해 StringBuilder 사용
        int mode = 0; // 초기 모드는 0

        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx); // 현재 위치의 문자를 가져옵니다.

            if (currentChar == '1') { // '1'을 만난 경우
                mode = 1 - mode; // mode를 토글합니다. (0에서 1로, 1에서 0으로)
            } else {
                // 현재 문자가 '1'이 아닌 경우에만 mode에 따라 처리
                if ((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 != 0)) {
                    ret.append(currentChar); // 조건에 맞는 경우 ret에 추가
                }
            }
        }

        // ret이 빈 문자열이면 "EMPTY"를 반환, 그렇지 않으면 ret의 내용을 문자열로 반환
        return ret.length() > 0 ? ret.toString() : "EMPTY";
    }
}
