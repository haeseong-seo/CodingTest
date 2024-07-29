package 입문;

public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMin = dots[0][0];
        int xMax = dots[0][0];
        int yMin = dots[0][1];
        int yMax = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            if (dots[i][0] < xMin) {
                xMin = dots[i][0];
            }
            if (dots[i][0] > xMax) {
                xMax = dots[i][0];
            }
            if (dots[i][1] < yMin) {
                yMin = dots[i][1];
            }
            if (dots[i][1] > yMax) {
                yMax = dots[i][1];
            }
        }

        int width = xMax - xMin;
        int height = yMax - yMin;

        answer = width * height;

        return answer;
    }
}

// 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
// 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
// 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.