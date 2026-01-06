
package jan06.calasstask;

/**
 *
 * @author Masud Rana
 */
public class ArithmeticExceptionTest {
    public static void main(String[] args) {
       
        try {
           int a = 10, b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException");
        }
    }    
}
