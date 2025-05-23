package reviews.reviews2;

import java.io.*;
public class Review23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("正の整数を入力＞");
        int num = Integer.parseInt(br.readLine());
        System.out.print("\n");
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("結果: " + factorial);
    }
}
