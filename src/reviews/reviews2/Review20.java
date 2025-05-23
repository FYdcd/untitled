package reviews.reviews2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("正の整数を入力＞");
        int num = Integer.parseInt(br.readLine());
        System.out.print("\n");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("結果: " + sum);
    }
}
