package 기초;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기2 {
    public int[] solution(int l, int r) {
        // 결과를 저장할 리스트
        List<Integer> resultList = new ArrayList<>();

        // l부터 r까지의 숫자를 순회
        for (int i = l; i <= r; i++) {
            if (isMadeOfZeroAndFive(i)) {
                resultList.add(i);
            }
        }

        // 결과 리스트가 비어 있으면 -1 반환
        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        // 리스트를 배열로 변환하여 반환
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    // 숫자가 "0"과 "5"로만 이루어져 있는지 확인하는 메서드
    private boolean isMadeOfZeroAndFive(int num) {
        String str = String.valueOf(num);
        for (char ch : str.toCharArray()) {
            if (ch != '0' && ch != '5') {
                return false;
            }
        }
        return true;
    }
}

// 정수 l과 r이 주어졌을 때,
// l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진
// 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.