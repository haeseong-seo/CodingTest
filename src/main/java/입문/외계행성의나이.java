package 입문;

public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";

        String age962 = "abcdefghij";
        String ageArr = String.valueOf(age);

        for (int i = 0 ; i < ageArr.length() ; i++) {;
            int digit = Character.getNumericValue(ageArr.charAt(i));
            answer += age962.charAt(digit);
        }

        return answer;
    }
}
