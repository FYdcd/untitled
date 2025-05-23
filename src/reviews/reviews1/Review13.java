package reviews.reviews1;

public class Review13 {
    public static void main(String[] args){
        double randomNum = Math.random() * 6;
        int fortune = (int)randomNum;
        if(fortune == 1) {
            System.out.println("大吉");
        }else if(fortune == 2) {
            System.out.println("中吉");
        }else if(fortune == 3){
            System.out.println("小吉");
        }else if(fortune == 4){
            System.out.println("吉");
        }else if(fortune == 5){
            System.out.println("凶");
        }else{
            System.out.println("大凶");
        }
    }
}
