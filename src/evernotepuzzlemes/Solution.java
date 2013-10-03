package evernotepuzzlemes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

   private static int elements;
   private static long solution = 1;
   private static int[] values;
   private static int zeroes;
    
   public static void main(String[] args) {
       try{
            readData();
        }catch(IOException e){
            e.printStackTrace();
        }
       printStuff();
    }
    
   
   static void printStuff(){
       if(zeroes == 0){
            for (int i = 0; i < elements; i++) {
                System.out.println(solution/values[i]); 
            }
       }else if(zeroes == 1){
            for (int i = 0; i < elements; i++) {
                if(values[i] == 0){
                    System.out.println(solution); 
                }else{
                    System.out.println(0);
                }
            }
       }else{
           for (int i = 0; i < elements; i++) {
                System.out.println(0); 
            }
       }
   }
    
    
    static void readData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        elements = Integer.parseInt(st.nextToken());
        values = new int[elements];
        int value;
        for (int i = 0; i < elements; i++) {
            st = new StringTokenizer(br.readLine());
            value = Integer.parseInt(st.nextToken());
            values[i] = value;
            if(value == 0){
                zeroes++;
            }else{
                solution = solution * value;  
            }
        }       
    }
}
