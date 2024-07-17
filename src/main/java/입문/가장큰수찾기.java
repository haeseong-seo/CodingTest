package 입문;

public class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int[] answer = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]){
                answer[0] = array[i];
                answer[i] = i;
            }
        }

        return answer;
    }
}
