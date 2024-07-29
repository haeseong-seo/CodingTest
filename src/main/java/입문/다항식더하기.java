package 입문;

public class 다항식더하기 {
    public String solution(String polynomial) {
        String answer = "";
        int withX = 0;
        int just = 0;

        String[] temp = polynomial.split(" ");

        for (int i = 0; i < temp.length; i++) {
            // x가 포함된 요소의 합 찾기
            // x가 포함된 항
            if (temp[i].contains("x")) {
                // x 단독 항
                if (temp[i].equals("x")) {
                    withX += 1;
                } else {
                    // x를 제거한 수를 num에 담음
                    temp[i] = temp[i].replace("x", "");
                    int num = Integer.parseInt(temp[i]);
                    withX += num;
                }
            }
            // +가 아닌 요소의 합 구하기(상수항일 경우)
            else if (!temp[i].equals("+")) {
                int num = Integer.parseInt(temp[i]);
                just += num;
            }
        }

        // x의 계수가 1개일 때
        if (withX == 1) {
            if (just == 0) {
                answer = "x";
            } else if (just != 0) {
                answer = "x + " + just;
            }
        }
        // x의 계수가 0개 일 때
        else if (withX == 0) {
            // 상수의 계수가 0
            if (just == 0) {
                answer = "0";
            }
            // 상수의 계수가 0이 아닐 때
            else if (just != 0) {
                answer = Integer.toString(just);
            }
        }
        // x의 계수가 1도 아니고 0도 아닐 때
        else if (withX != 0 && withX != 1) {
            if (just == 0) {
                answer = withX + "x";
            } else if (just != 0) {
                answer = withX + "x + " + just;
            }
        }
        return answer;
    }
}

// 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
// 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
// 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
// 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
// 같은 식이라면 가장 짧은 수식을 return 합니다.