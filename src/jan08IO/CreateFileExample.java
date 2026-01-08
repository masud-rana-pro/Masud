
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
            File fileObj = new File("C:\\Users\\Masud Rana\\Desktop\\myfile.txt");
            if(fileObj.createNewFile()) {
                System.out.println("File is created.");
            } else{
                System.out.println("File is created.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
