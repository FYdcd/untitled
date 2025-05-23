package reviews.reviews2;

import java.io.*;
public class Review19 {//階乗を計算
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("正の整数を入力（16以下）＞");
        int num = Integer.parseInt(br.readLine());
        System.out.print("\n");
        if(num >= 100){
            System.out.println("数値が大きすぎます。");
            System.exit(0);
        }
        int factorial = 1;
        int i = 1;
        while(i <= num) {
            factorial *= i;
            i = i + 1;
        }
        System.out.println("結果: "+ factorial);
    }
}