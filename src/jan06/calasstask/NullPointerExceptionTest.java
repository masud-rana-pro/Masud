package jan06.calasstask;

/**
 *
 * @author Masud Rana
 */
public class NullPointerExceptionTest {

    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        }
    }
}
