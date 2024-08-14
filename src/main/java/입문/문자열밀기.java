package 입문;

public class 문자열밀기 {
    public int solution(String A, String B) {
        // A와 B의 길이가 다르면 B로 만들 수 없으므로 -1 반환
        if (A.length() != B.length()) {
            return -1;
        }

        // B가 A를 한 번도 밀지 않은 상태와 같다면 0 반환
        if (A.equals(B)) {
            return 0;
        }

        String temp = A;

        // A를 한 칸씩 밀면서 B와 같은지 확인
        for (int i = 1; i <= A.length(); i++) {
            // A를 오른쪽으로 한 칸 밀기
            temp = temp.substring(temp.length() - 1) + temp.substring(0, temp.length() - 1);

            // 만약 B와 같다면 현재 횟수 i를 반환
            if (temp.equals(B)) {
                return i;
            }
        }

        // A를 최대 길이만큼 밀어도 B와 같지 않으면 -1 반환
        return -1;
    }
}

// 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
// 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
// A를 밀어서 B가 될 수 있다면
// 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요