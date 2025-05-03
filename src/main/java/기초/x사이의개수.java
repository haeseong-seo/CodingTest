package 기초;

public class x사이의개수 {
    public int[] solution(String myString) {
        String[] split = myString.split("x", -1);
        int[] answer = new int[split.length];

        for (int i = 0; i < split.length; i++){
            answer[i] = split[i].length();
        }

        return answer;
    }
}

// 문자열 myString이 주어집니다. 
// myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

