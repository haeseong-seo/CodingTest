package 입문;

import java.util.HashMap;
import java.util.Map;

public class 모스부호1 {
    public String solution(String letter) {
        // 모스부호를 배열 morse 에 담음
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        // letter 를 공백을 기준으로 나눔
        String[] morseString = letter.split(" ");

        // 단어를 저장할 StringBuilder 객체 생성
        StringBuilder bul = new StringBuilder();

        // 공백으로 나눈 모스부호를 반복하며 해독
        for (String wb : morseString){
            // 모스 배열에서 현재 모스부호와 일치하는 알파벳을 찾음
            for (int i = 0; i < morse.length; i++) {
                if (wb.equals(morse[i])) {
                    // 알파벳을 builder 에 저장, ('a'의 ASCII 값이 97 이므로 i를 더해서 알파벳으로 전환
                    bul.append(Character.toString(i + 'a'));
                }
            }
        }
        // 결과를 문자열로 반환
        return bul.toString();
    }

}


// 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
// 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
// 문자열 letter 가 매개변수로 주어질 때,
// letter 를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.