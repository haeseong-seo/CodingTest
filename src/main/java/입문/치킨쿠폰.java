package 입문;

public class 치킨쿠폰 {
    public int solution(int chicken) {
        int answer = 0;

        // 쿠폰이 10장 있을 때 반복 (즉, 아직 더 받을 수 있는 서비스 치킨이 있을 경우 루프를 돔)
        while (chicken >= 10){
            // 쿠폰 10장당 서비스 치킨 (현재 쿠폰 수를 10으로 나눈 몫이 이번에 받을 수 있는 치킨의 개수)
            int serviceChicken = chicken / 10;

            // answer 에 서비스 치킨 추가 (서비스 받은 치킨의 개수를 총 합계에 추가)
            answer += serviceChicken;

            // 남은 쿠폰 + 서비스 치킨으로 받은 쿠폰 (남은 쿠폰과 새롭게 받은 서비스 치킨에서 얻은 쿠폰을 합산하여 다음 루프에서 사용할 쿠폰의 수를 갱신)
            chicken = chicken % 10 + serviceChicken;
        }

        return answer;
    }
}

// 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
// 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고,
// 서비스 치킨에도 쿠폰이 발급됩니다.
// 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때
// 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.