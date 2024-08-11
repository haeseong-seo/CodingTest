package 입문;

public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";

        // 2진수를 10진수 변환
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        int sum = num1 + num2;

        // toBinaryString() : 10진수를 2진수로 바꾸어 String 타입으로 반환
        answer = Integer.toBinaryString(sum);

        return answer;
    }
}

// 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
// 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.