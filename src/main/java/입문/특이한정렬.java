package 입문;

import java.util.Arrays;
import java.util.Comparator;

public class 특이한정렬 {
    public int[] solution(int[] numlist, int n) {
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            public int compare(Integer a, Integer b) {
//                int diffA = Math.abs(a - n);
//                int diffB = Math.abs(b - n);
//
//                if (diffA == diffB){
//                    // 거리가 같다면 더 큰 수가 앞으로 오도록
//                    return b - a;
//                }else {
//                    // 거리가 가까운 순서대로
//                    return diffA - diffB;
//                }
//            }
//        } ;
//        // numlist 배열을 Integer 로 변롼 (기본형 배열은 Comparator 를 사용할 수 없음)
//        Integer[] numlistInteger = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
//
//        // 정렬
//        Arrays.sort(numlistInteger, comparator);
//
//        // 다시 int 형으로 변환
//        return Arrays.stream(numlistInteger).mapToInt(Integer::intValue).toArray();

        // 방법 2
        int size = numlist.length;

        for (int i = 0; i < size - 1; i++) {
            for (int k = i + 1; k < size; k++) {
                // 절대 거리 계산 (그 값이 양수인지 음수인지에 따라 부호를 조정)
                int a = (numlist[i] - n) * (numlist[i] > n ? 1 : -1);
                int b = (numlist[k] - n) * (numlist[k] > n ? 1 : -1);

                // 두 요소 a, b 를 비교하여 a가 더 크다면 두 요소를 교환
                // 만약 같다면 numlist[i]와 numlist[k]를 비교하여 더 큰 수가 앞에 오도록 교환
                if (a > b || (a == b && numlist[i] < numlist[k])) {
                    // 요소 교환
                    int temp = numlist[i];

                    numlist[i] = numlist[k];
                    numlist[k] = temp;
                }

            }
        }
        return numlist;
    }
}

// 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
// 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
// 정수가 담긴 배열 numlist와 정수 n이 주어질 때
// numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.