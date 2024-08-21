package 기초;

public class 공배수 {
    public int solution(int number, int n, int m) {
//        int answer = 0;
//
//        if (number % n == 0){
//            if (number % m == 0){
//                answer = 1;
//            }
//        }
//        return answer;
        return number % 2 == 0 && n % m == 0 ? 1 : 0;
    }
}

// 정수 number와 n, m이 주어집니다.
// number가 n의 배수이면서 m의 배수이면 1을
// 아니라면 0을 return하도록 solution 함수를 완성해주세요.