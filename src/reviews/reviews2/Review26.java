package reviews.reviews2;

public class Review26 {
    public static void main(String[] args){
        int[] numArray = new int[1_000_000_00];
        for(int j = 0; j < numArray.length; j++){
            numArray[j] = j+1;
        }

        int target = 555;
        int count = 0;
        for(int i =0; i < numArray.length; i++){
            if(numArray[i] == target){
                count++;
            }
        }
        System.out.println("探索した値: " + target);
        System.out.println("一致した数: " + count);
    }
}
