package 입문;

public class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = array[0];
        int max = 0;
        int frequent[] = new int[1000];

        for (int i = 0; i < array.length; i++) {
            frequent[array[i]]++;

            if (max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }
        int temp = 0;

        for (int j = 0; j < 1000; j++) {
            if (max == frequent[j]) temp++;
            if (temp > 1) answer = -1;
        }

        return answer;
    }
}
