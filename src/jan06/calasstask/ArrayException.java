
package jan06.calasstask;

/**
 *
 * @author Masud Rana
 */
public class ArrayException {
    public static void main(String[] args) {
        try {
            int [] arr = {10,15,20};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException t) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }    
}
