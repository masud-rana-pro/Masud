
package jan13.IO;

import java.io.FileInputStream;

/**
 *
 * @author Masud Rana
 */
public class FileOutputStreamPractices {

    public static void main(String[] args) {
        try (FileInputStream fi = new FileInputStream("C:\\Users\\Masud Rana\\Desktop\\test.txt")) {
            int i;
            while((i = fi.read()) != -1) {
                System.out.print((char)i);
            }
            
            //fi.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}


