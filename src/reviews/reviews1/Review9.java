package reviews.reviews1;

import java.io.*;
public class Review9 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("名前を入力してください＞");
        String inputNum = br.readLine();
        System.out.print("年齢を入力してください＞");
        int age = Integer.parseInt(br.readLine());
        System.out.println(age+"歳の"+inputNum+"さん。\nこんにちは。");
    }
}
