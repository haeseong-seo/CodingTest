package 입문;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();

        for (int[]t : score){
            // 각 학생의 점수 합계를 scoreList 에 담아둠
            scoreList.add(t[0] + t[1]);
        }
        // 내림차순으로 정렬(높은 점수가 먼저 오도록)
        scoreList.sort(Comparator.reverseOrder());

        // answer 배열을 학생 수만큼 초기화
        int[] answer = new int[score.length];
        // 각 학생의 점수 합계가 scoreList 에서 몇 번째 위치하는지 찾아 등수를 계산 (인덱스는 0부터 시작하므로 +1)
        for (int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}

// 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
// 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
// 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.