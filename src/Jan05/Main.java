
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
        Person p1 = new Person(1292593, "Woalinur", 30000);
        Person p2 = new Person(1292599, "Akib", 30000);
        Person p3 = new Person(1292520, "Shohel", 30000);
        
        
        List list = new ArrayList();
        
        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
