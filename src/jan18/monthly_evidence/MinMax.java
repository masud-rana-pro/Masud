
package jan18.monthly_evidence;

import java.util.Scanner;

/**
 *
 * @author masud
 */
public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int n1 = in.nextInt();
        System.out.print("Enter Second number: ");
        int n2 = in.nextInt();
        System.out.print("Enter Third number: ");
        int n3 = in.nextInt();  
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("The max number is : " + n1 + 
                    "\nThe min number is : " + ((n3 < n2)? n3:n2));
        }else if (n2 > n3) {
            System.out.println("The max number is : " + n2 + 
                    "\nThe min number is : " + ((n1 < n3)? n1:n3));            
        }else {
            System.out.println("The max number is : " + n3 + 
                    "\nThe min number is : " + ((n1 < n2)? n1:n2));            
        }
    }
}
