
package jan06.generics.lavel01;

/**
 *
 * @author masud
 */
public class GenericBox<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    static <T> void print(T value) {
        System.out.println("The value is : " + value);
    }
}
