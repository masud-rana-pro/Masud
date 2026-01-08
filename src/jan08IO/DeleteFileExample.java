
package jan08IO;

import java.io.File;

/**
 *
 * @author Masud Rana
 */
public class DeleteFileExample {
    public static void main(String[] args) {
        File delFile = new File("C:\\Users\\Masud Rana\\Desktop\\renamed-file.txt");
        
        if (delFile.delete()) {
            System.out.println("File is deleted successfully.");
        } else {
            System.out.println("File is not deleted.");
        }
    }
}
