package 기초;

import java.util.Arrays;

public class 주사위게임3 {
    public int solution(int a, int b, int c, int d) {

        int[] dice = {a, b, c, d};
        Arrays.sort(dice);  // 주사위 숫자를 정렬하여 처리하기 쉽게

        // 1. 네 숫자가 모두 같을 때
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }

        // 2. 세 개의 숫자가 같을 때
        if (dice[0] == dice[2] || dice[1] == dice[3]) {
            int p = dice[1];  // 세 개가 같은 숫자
            int q = dice[0] == dice[2] ? dice[3] : dice[0];  // 나머지 하나의 숫자
            return (10 * p + q) * (10 * p + q);
        }

        // 3. 두 개씩 짝을 이룬 경우
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0];
            int q = dice[2];
            return (p + q) * Math.abs(p - q);
        }

        // 4. 두 개의 숫자만 같고 나머지 두 숫자가 각각 다른 경우
        if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
            int p = dice[1];  // 두 개가 같은 숫자
            int q = dice[0] == dice[1] ? dice[2] : dice[0];  // 다른 두 숫자 중 하나
            int r = dice[2] == dice[3] ? dice[1] : dice[3];  // 다른 두 숫자 중 나머지 하나
            return q * r;
        }

        // 5. 네 숫자가 모두 다를 때
        return dice[0];  // 가장 작은 숫자 반환
    }
}

// 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다.
// 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//
//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.