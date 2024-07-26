package 입문;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        // quiz 배열의 각 요소에 대해 결과를 저장할 배열 선언
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            // 공백을 기준으로 문자열을 분할하여 배열에 저장
            String[] parts = quiz[i].split(" ");

            // 첫 번째 숫자
            int num1 = Integer.parseInt(parts[0]);
            // 연산자
            String operator = parts[1];
            // 두 번째 숫자
            int num2 = Integer.parseInt(parts[2]);
            // 등호
            String equalsSign = parts[3];
            // 결과 숫자
            int result = Integer.parseInt(parts[4]);

            // 연산자에 따라 덧셈 또는 뺄셈 수행
            int computedResult = 0;
            if (operator.equals("+")) {
                computedResult = num1 + num2;
            } else if (operator.equals("-")) {
                computedResult = num1 - num2;
            }

            // 계산 결과와 주어진 결과를 비교하여 "O" 또는 "X"를 answer 배열에 저장
            if (computedResult == result) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;

        // for(int i=0; i<quiz.length; i++){
        //            String[] text = quiz[i].split(" ");
        //            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
        //            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        //        }
        //        return quiz;
    }
}

// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
// 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.