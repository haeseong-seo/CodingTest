package 입문;

public class 제곱수판별하기 {
    public int solution(int n) {
        // n의 제곱근 구하기
        double sqrt = Math.sqrt(n);

        if (sqrt % 1 == 0){
            return 1;
        }else {
            return 2;
        }
    }
}
