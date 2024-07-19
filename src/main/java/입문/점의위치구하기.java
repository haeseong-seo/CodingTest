package 입문;

public class 점의위치구하기 {
    public int solution(int[] dot) {
        int answer = 0;

        // 방법 1
//        if (dot[0] > 0 && dot[1] > 0) {
//            answer = 1;
//        }else if (dot[0] < 0 && dot[1] > 0){
//            answer = 2;
//        } else if (dot[0] < 0 && dot[1] < 0) {
//            answer = 3;
//        }else {
//            answer = 4;
//        }
//        return answer;

        // 방법 2
        int xParam = dot[0];
        int yParam = dot[1];

        if (xParam > 0){
            answer = (yParam > 0) ? 1 : 4;
        }else {
            answer = (yParam > 0) ? 2 : 3;
        }
        return answer;
    }
}
