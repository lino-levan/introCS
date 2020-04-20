/* SFHS 2019-2020
 * Intro CS ~ Mrs. Vollucci
 * Periods 1, 5, & 6
 */

 /* NOTE: Please look at
  * Cat.java first!
  */

// SECTION B: CAT CLASS

/* HINTS BEFORE STARTING
 * SECTION B:
 - Keep Starter File A open in a separate window (side-by-side) while filling in the Cat class for reference.
- Problem 1 starts in the Cat class itself.
- Do not attempt to make a cat object unless you have implemented the Cat constructor first.
*/

class Main {
  public static void main(String[] args) {
      // CREATE CAT OBJECTS

      /* PROBLEM 2 (continued):
      Uncomment the statements below after implementing the
      Cat constructor method to test your code. */

      Cat nyan = new Cat("NyanCat", "Pop Tart", "Internetz", "Rainbows", "Nyan nyan!", 0);
      Cat grump = new Cat("GrumpyCat", "Snowshoe or Ragdoll", "Tabatha Bundesen", "nothing", "No.", 3);
      Cat king = new Cat("Simba", "East African Lion", "Disney", "The Circle of Life", "Hakuna matata!", 3);

      /* PROBLEM 3 (continued):
      Bring the cats to show & tell! Uncomment the statements below
      after implementing the show_and_tell method to test your code.
      */

      nyan.show_and_tell();
      grump.show_and_tell();
      king.show_and_tell();

      /* PROBLEM 4 (continued):
      Feed the cats! Uncomment the statements below
      after implementing the feed method to test your
      code. */

      nyan.feed(); // does not need to be fed.
      grump.feed(); // should be fed.

      /* PROBLEM 5 (continued):
      Play with the cats! Uncomment the statements below after
      implementing the play method to test your code. */

      nyan.play(grump);
      grump.play(nyan);
      nyan.play(king);

      /* PROBLEM 6 (continued):
      Uncomment the statements below after implementing the meow
      method to test your code. */

      king.meow();
      grump.meow();
      nyan.meow();

      /* PROBLEM 7 (continued):
      Uncomment the statements below after implementing the
      getter methods to test your code. */
      System.out.println(nyan.get_hunger_level());
      System.out.println(king.get_hunger_level());
      System.out.println(grump.get_hunger_level());
      System.out.println(king.get_total_paws());
      System.out.println(Cat.get_total_cats());
  }
}
