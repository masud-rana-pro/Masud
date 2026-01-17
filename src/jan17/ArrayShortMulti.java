
package jan17;

import java.util.Arrays;

/**
 *
 * @author Masud Rana
 */
public class ArrayShortMulti {
    public static void main(String[] args) {
        int [][] arr = {{42, 36, 12, 95}, {13, 55, 43}, {78,10, 96}};

        for (int[] is : arr) {
            int[]temp = is;
            Arrays.sort(temp);
            for(int i = 0; i < temp.length; i++){
                for(int j = i + 1; j < temp.length - 1; j++) {
                    if (temp[i] > temp[j]){
                        int tr = temp[i];
                         temp[i] = temp[j];
                         temp[j] = tr;
                    }  
                }
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.println(j);
            }
        }        
//        Arrays.sort(arr);
    }
}
