package 입문;

public class 피자나눠먹기2 {
    public int solution(int n) {
        int answer = 0;

        // i = 피자 판수
        for(int i = 1; i <= n * 6; i++){
            if (i * 6 % n == 0){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
