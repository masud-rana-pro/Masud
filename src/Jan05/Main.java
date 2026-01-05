
package Jan05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Masud Rana
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person(1292522, "Masud", 30000);
        
        List list = new ArrayList();
        
        list.add(p);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
