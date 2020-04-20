/* Be sure to look at the
 * instructions on the PROG
 * REVIEW C Google Doc and to
 * watch the Prog Review C
 * Overview video first
 */

public class Chef {
    // 2 class vars
    public static int numChefs = 0;
    public static String restaurant = "Cook, Serve, Delicious!";

    // 3 instance vars
    private String favDish;
    private String specialty;
    private boolean isAssistant;

    // 1 constructor
    public Chef(String fD, String s, boolean iA){
      favDish = fD;
      specialty = s;
      isAssistant = iA;
      numChefs++;
    }

    // 3 getter methods
    public String getFavDish(){
      return(favDish);
    }

    public String getSpeciality(){
      return(specialty);
    }

    public static int getNumChefs(){
      return(numChefs);
    }

    // 1 setter method
    public void setSpeciality(String newSpecial){
      specialty = newSpecial;
    }

    // 2 additional methods
    public void promote(){
      if(isAssistant){
        isAssistant=false;
        System.out.println("Congratulations!");
      }else{
        System.out.println("You're already the head chef!");
      }
    }

    public void orderUp(String dish, int numOrders){
      System.out.println("I have "+numOrders+" orders of "+dish+"! Order Up!");
    }
}
