
package jan08IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Masud Rana
 */
public class WriteFileExample {
    public static void main(String[] args) {
        try {
            File fileObj = new File("C:\\Users\\Masud Rana\\Desktop\\renamed-file.txt");
            FileWriter fw = new FileWriter(fileObj);
            BufferedWriter bw = new BufferedWriter(fw);
            
            
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}
