package reviews.reviews2;

import java.io.*;
public class Review19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("正の整数を入力＞");
        int num = Integer.parseInt(br.readLine());
        System.out.print("\n");
        long factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i += 1;
        }
        System.out.println("結果: " + factorial);
    }
}
