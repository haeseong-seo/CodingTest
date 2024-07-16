package 입문;

import java.util.ArrayList;
import java.util.List;

public class 짝수는싫어요 {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2]; //홀수입력값 때문에 (n+1)/2

        for (int i = 1; i <= n; i++){
            if(i % 2 == 1){
                answer[i / 2] = i; // 홀수값들이 순서대로 들어갈 수 있도록
            }
        }
        return answer;
    }
}
