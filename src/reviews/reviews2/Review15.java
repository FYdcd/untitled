package reviews.reviews2;
import java.io.*;

public class Review15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("整数を入力＞");
        int num = Integer.parseInt(br.readLine());
        System.out.print("\n");
        if(num%2 == 0){
            System.out.println("偶数");
        }else if(num%2 == 1){
            System.out.println("奇数");
        }else{
            System.out.println("無効な入力です。");
        }
    }
}