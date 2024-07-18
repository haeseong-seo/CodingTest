package 입문;

public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;

        if (n >= 10){
            service = n / 10;
            answer = n * 12000 + k * 2000 - service * 2000;
        }else {
            service = 0;
            answer = n * 12000 + k * 2000;
        }

        return answer;
    }
}
