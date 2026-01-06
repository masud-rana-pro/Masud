/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06.calasstask;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Masud Rana
 */
public class EmployeeChild implements IEmployee {

    @Override
    public Map<Integer, Employee> showMap() {
        Employee e1 = new Employee(101, "Masud", 25000, 25);
        Employee e2 = new Employee(102, "Woalinur", 30000, 28);
        Employee e3 = new Employee(103, "Akib", 35000, 26);
        Employee e4 = new Employee(104, "Shohel", 30000, 27);
        Map<Integer, Employee> map = new HashMap();
        
        
            map.put(101, e1);
            map.put(102, e2);
            map.put(103, e3);
            map.put(104, e4);
       
        
        return map;
    }

}
