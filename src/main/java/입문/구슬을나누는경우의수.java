package 입문;

public class 구슬을나누는경우의수 {
    public int solution(int balls, int share) {
        long answer = 1;

        int shareIndex = 1;

        // share + 1부터 balls 까지 반복
        for (int i = share + 1; i <= balls; i++){
            // 현재의 숫자를 answer 에 곱함
            answer *= i;
            // 분모의 현재 숫자로 answer 을 나눔
            answer /= shareIndex;
            // 다음 분모 값을 위해 1 증가
            shareIndex++;
        }

        return (int)answer;

//    방법2
//    long answer = 0;
//
//    int d = (balls - share) > share ? share : balls - share;
//        if (d == 0) return 1;
//
//        return solution(balls - 1, d - 1) * balls / d;
    }
    // 힌트를 잘 보면
    //
    //분자의 경우 : n * n-1 * n-2 * n-3 ······ 3 * 2 * 1
    //
    //분모의 경우 : (n-m* n-m-1 ······ 2 * 1) * (m* m-1 * m-2 * ······ * 2 * 1)

    //뭔가 보이지 않는가?

    //이걸 숫자로 보면 굉장히 쉬운 규칙이 하나 보이는데 n이 20, m이 5라고 가정하면
    //
    //분자의 경우 : 20 * 19 * 18 * 17 * ······ * 3 * 2 * 1
    //
    //분모의 경우 : (15 * 14 * 13 * 12 * ······ * 3 * 2 * 1) (5 * 4 * 3 * 2 * 1)

    //분모의 15! 은 분자와 함께 나눠 없앨수 있다. 이경우 식이 이렇게 바뀌고
    //
    //분자의 경우 : 20 * 19 * 18 * 17 * 16
    //
    //분모의 경우 : 5 * 4 * 3 * 2 * 1
}

// 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
// 구슬은 모두 다르게 생겼습니다.
// 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
// balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
