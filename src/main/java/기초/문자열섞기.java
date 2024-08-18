package 기초;

public class 문자열섞기 {
    public String solution(String str1, String str2) {
//        방법 1
        StringBuilder answer = new StringBuilder();
        int length = str1.length();

        for (int i = 0; i < length; i++){
            answer.append(str1.charAt(i)).append(str2.charAt(i)); ;
        }
        return answer.toString();

//        방법 2
//        String answer = "";
//
//        int length = str1.length();
//
//        String[] a = str1.split("");
//        String[] b = str2.split("");
//
//        for (int i = 0; i < length; i++) {
//            answer += a[i] + b[i];
//        }
//        return answer;
    }
}

// 길이가 같은 두 문자열 str1과 str2가 주어집니다.
//
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
// 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.