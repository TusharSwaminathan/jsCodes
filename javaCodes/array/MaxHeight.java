package array;
import java.util.*;

class MaxHeight {

    public static void main (String[]a){
        int[] arr = {1,2,2,1};
        ArrayList<Height> arrHeight = new ArrayList<Height>();
        for(int i=0;i<arr.length/2;i++){
            System.out.println(arr[i]+"==="+arr[i+1]);
            arrHeight.add(new Height(arr[i],arr[i+1]));
        }
        for(int i=0;i<arr.length/2;i++){
        
          System.out.println(arrHeight.get(i).feet);
          System.out.println("=====");
        }
    }
}