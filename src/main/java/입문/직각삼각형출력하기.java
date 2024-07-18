package 입문;

import java.util.Scanner;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        방법 1
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        방법2
        for (int i = 1; i <= n; i++){
            System.out.println("*".repeat(i));
        }
    }
}
