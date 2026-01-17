
package jan11.selfpractice;

import java.util.Scanner;

/**
 *
 * @author Masud Rana
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
       Scanner s1 = new Scanner(System.in);
        System.out.println("Value of X : ");
        int x = s1.nextInt();
        System.out.println("Value of Y : ");
        int y = 0;
        int result = 0;
        int[] arr = new int[2];
           try{
               result += x/y;
               arr[0] = x;
               arr[1] = y;
               //System.exit(0);
               System.out.println(arr[2]);
           }catch(ArithmeticException a){
               System.out.println(a);
               System.out.println("Value of Y is not competivle : please enter greater than 1.");
               y = s1.nextInt();
               result += x/y;
               System.out.println("Arithmetic exception solved.");
               a.printStackTrace();
           }catch(IndexOutOfBoundsException i){
               System.out.println("Array exception solved.");
               i.printStackTrace();
           }catch(Throwable t){
               System.out.println("Runtime exception solved");
               t.printStackTrace();
           } finally {
               System.out.println("Finally");
           }
           System.out.println(result);
           System.out.println("EoF");
    }
}
