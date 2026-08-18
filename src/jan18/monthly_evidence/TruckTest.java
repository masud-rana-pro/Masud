
package jan18.monthly_evidence;

/**
 *
 * @author masud
 */
public class TruckTest {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.regularPrice = 1000000;
        t.weight = 2500;
        
        System.out.println("The price of this truck after discount : " + t.getSalePrice());
    }
}
