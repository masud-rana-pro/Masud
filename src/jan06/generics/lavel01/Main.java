
package jan06.generics.lavel01;

/**
 *
 * @author masud
 */
public class Main {
    public static void main(String[] args) {
        GenericBox<Integer> i = new GenericBox<>();
        i.setValue(500);
        System.out.println(i.getValue());
        
        GenericBox<String> s = new GenericBox<>();
        s.setValue("Masud Rana");
        System.out.println(s.getValue());
        GenericBox.print("Masud");
        GenericBox.print(10000);
    }
}
