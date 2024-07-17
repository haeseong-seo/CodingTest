package 입문;

public class 암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        // 방법 1.
        //
        for (int i = code; i <= cipher.length(); i += code){
            answer += cipher.substring(i - 1, i);
        }

        // 방법2.
//        for (int i = 1; i <= cipher.length(); i++) {
//            if (i % code == 0){
//                answer += cipher.substring(i, i + 1);
//            }
//        }

        return answer;
    }
}
