package 입문;

public class 주사위의개수 {
    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);

        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;

        answer = a * b * c;

        return answer;
    }
}
