
package jan08IO;

import java.io.File;
import java.io.IOException;



/**
 *
 * @author Masud Rana
 */
public class CreateFileExample {
    public static void main(String[] args) {
      
        try{
            File fileObj = new File("C:\\Users\\masud\\Desktop\\myfile.txt");
            if(fileObj.createNewFile()) {
                System.out.println("File is created: " + fileObj.getName() + 
                        "\nCan this file writeable: " +fileObj.canWrite() + 
                        "\nCan this file readable: " + fileObj.canRead() + 
                        "\nFile absulate fath is: " + fileObj.getAbsolutePath() +
                        "\nThe absulate file is: " + fileObj.getAbsoluteFile());
            } else{
                System.out.println("File is not created.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
