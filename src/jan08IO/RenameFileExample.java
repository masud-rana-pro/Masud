package jan08IO;

import java.io.File;


/**
 *
 * @author Masud Rana
 */
public class RenameFileExample {
    public static void main(String[] args) {
        File oldFile = new File("C:\\Users\\Masud Rana\\Desktop\\myfile.txt");
        File newFile = new File("C:\\Users\\Masud Rana\\Desktop\\renamed-file.txt");
        
        if (oldFile.renameTo(newFile)){
            System.out.println("File is renamed successfully.");
        } else {
            System.out.println("File is not renamed successfully.");
        }
        
    }
}
