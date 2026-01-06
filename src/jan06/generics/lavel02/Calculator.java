
package jan06.generics.lavel02;

/**
 *
 * @author masud
 */
public class Calculator<T extends Number> {
    public double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
    
    public static void main(String[] args) {
        Calculator<Integer> ic = new Calculator<>();
        System.out.println("The sum of two integer is : " + ic.add(5, 7));
        
        Calculator<Double> dc = new Calculator<>();
        System.out.println("The sum of two integer is : " + dc.add(5.25, 7.50));        
    }
}
