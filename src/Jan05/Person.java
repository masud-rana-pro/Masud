
package Jan05;

/**
 *
 * @author Masud Rana
 */
public class Person {
   public int id ;
   public String name;
   public double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }



   

}
