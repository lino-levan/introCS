import java.util.*;
/* SFHS 2019-2020
 * Intro CS ~ Mrs. Vollucci
 * Periods 1, 5, & 6
 *
 * Due Friday, 04/03 @ 3 PM
 *
 * Note: You will need to add
 * the input variables & their
 * data types. You may also need
 * to change the return type for
 * the method.
 */


class Main {
  public static void main(String[] args) {
    // Create one chef object here
    Chef ramsay = new Chef("Lamb Sauce","Beef Wellington",false);
    // Call the methods on the
    // object using dot notation
    System.out.println(ramsay.getFavDish());
    System.out.println(ramsay.getSpeciality());
    System.out.println(ramsay.getNumChefs());
    ramsay.promote();
    ramsay.orderUp("Beef Wellington", 420);

    System.out.println("*****************");
    // Create another chef object
    Chef lino = new Chef("Carbonara","Spaghetti",true);
    // Call the methods on the 2nd
    // object using dot notation
    System.out.println(lino.getFavDish());
    System.out.println(lino.getSpeciality());
    System.out.println(lino.getNumChefs());
    lino.promote();
    lino.orderUp("Spaghetti Sauce", 2);

  }
}
