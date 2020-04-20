import java.util.*;
/* SFHS 2019-2020
 * Intro CS ~ Mrs. Vollucci
 * Periods 1, 5, & 6
 *
 * Due Friday, 03/27 @ 3 PM
 *
 * Note: You will need to add
 * the input variables & their
 * data types. You may also need
 * to change the return type for
 * the method.
 */

class Main {
    public static void main(String[] args) {

        // Problem 1
        // Type the list & test given in the video below
        ArrayList<String> words = new ArrayList<String>();
        words.add("minecraft");
        words.add("undertale");
        words.add("cuphead");
        words.add("subnautica");
        System.out.println(longest_word(words));
        // Problem 2
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        // Type the test below
        System.out.println(sum_of_odds(nums));

    }

    // Problem 1
    public static String longest_word(ArrayList<String> list) {
      String longest = "";
      for(int i=0;i<list.size();i++){
        if(list.get(i).length() > longest.length()){
          longest = list.get(i);
        }
      }
      return(longest);
    }

    // Problem 2
    public static int sum_of_odds(ArrayList<Integer> nums) {
      int rollingComp = 0;
      for(int i=0;i<nums.size();i++){
        if(nums.get(i)%2 == 1){
          rollingComp += nums.get(i);
        }
      }
      return(rollingComp);
    }

}
