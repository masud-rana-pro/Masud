
package jan18.monthly_evidence;

/**
 *
 * @author masud
 */
public class Truck extends Vehicle {
    int weight;

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.regularPrice * 0.9;
        } else {
            return super.regularPrice;
        }
    } 
}
