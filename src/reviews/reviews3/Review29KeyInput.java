package reviews.reviews3;

import java.io.*;
public class Review29KeyInput {
    public String readString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        try{
            inputStr = br.readLine();
        }catch(IOException e){
            System.out.println("ERROR: IOException");
        }
        return inputStr;
    }
}
