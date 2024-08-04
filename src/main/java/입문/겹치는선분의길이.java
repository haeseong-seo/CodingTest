package 입문;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        // 좌표의 길이가 -100 ~ 100이기 때문에 201로 배열 정의
        int [] line = new int[201];

        // 각 선분의 범위에 해당하는 배열 값을 증가시킴
        for (int i = 0; i < lines.length; i++) {
            // 시작 인덱스를 배열로 변환 (음수는 배열에 넣을 수 없기 때문에 음수 부분을 100을 더해 양수 혹은 0으로 맞춤)
            int start = lines[i][0] + 100;
            // 끝 인덱스를 배열로 변환
            int end = lines[i][1] + 100;

            // 시작점에서 끝점까지 배열의 값을 증가시킴
            for (int j = start; j < end; j++) {
                // 각 선분의 시작점과 끝점 사이의 모든 인덱스를 순회하며,
                // 해당 인덱스의 값을 1씩 증가시킴.
                // 이렇게 하면 배열의 각 인덱스에 해당하는 좌표에서 몇 개의 선분이 겹치는지 알 수 있게 됨.
                line[j]++;
            }
        }
        int answer = 0;

        // 2개 이상의 선분이 겹치는 부분의 길이를 계산
        for (int i = 0; i < line.length; i++) {
            // 배열 값이 2 이상이면 두 개 이상의 선분이 겹친다는 의미
            if (line[i] > 1){
                answer++;
            }
        }
        return answer;
    }
}

// 선분 3개가 평행하게 놓여 있습니다.
// 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
// 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
//
// lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.