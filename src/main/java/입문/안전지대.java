package 입문;

import java.util.Arrays;

public class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;

        int length = board.length;
        int[][] newBoard = new int[length][length];

        // 원래 보드를 새로운 보드로 복사
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                newBoard[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 1) {
                    // 8방향을 안전하게 탐색
                    for (int x = -1; x <= 1; x++){
                        for (int y = -1; y <= 1; y++){
                            int newX = i + x;
                            int newY = j + y;
                            if (newX >= 0 && newX <length && newY >= 0 && newY < length){
                                newBoard[newX][newY] = 3;
                            }
                        }
                    }
                }
            }
        }

        // 안전한 지역 계산
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (newBoard[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

// 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한
// 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
// 지뢰는 2차원 배열 board에 1로 표시되어 있고
// board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때,
// 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.