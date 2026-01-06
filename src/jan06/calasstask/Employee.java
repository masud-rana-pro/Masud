
package jan06.calasstask;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Masud Rana
 */
public class Employee extends Main implements IEmployee {
    private int id;
    private String name;
    private double salary;
    private int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + '}';
    }

    Map<Integer, Employee> map1 = new HashMap();
    
    @Override
    public void showMap() {
        Main m = new Main();

    }
    
    
    
}
