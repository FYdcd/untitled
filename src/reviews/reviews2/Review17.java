package reviews.reviews2;

import java.io.*;
public class Review17 {//偶数のみ計算
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("正の整数を入力＞");
        int num = Integer.parseInt(br.readLine());
        System.out.print("\n");
        int sum = 0;
        int i = 1;
        while(i <= num) {
            if (i % 2 == 0) {
                sum += i;
            }
            i = i + 1;
        }
        System.out.println("結果: "+sum);
    }
}
