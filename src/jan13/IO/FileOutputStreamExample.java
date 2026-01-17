
package jan13.IO;
import com.sun.org.apache.xerces.internal.xs.PSVIProvider;
import java.io.FileOutputStream;

/**
 *
 * @author Masud Rana
 */
public class FileOutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("C:\\Users\\Masud Rana\\Desktop\\test.txt", true)) {
            String s = "\nHi this is a text that will be written to this file.";
            
            byte[] bs = s.getBytes();
            fout.write(bs);
            //fout.colse();
            
            System.out.println("Success..");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
