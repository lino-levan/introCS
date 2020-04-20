/* SFHS 2019-2020
 * Intro CS ~ Mrs. Vollucci
 * Periods 1, 5, & 6
 */

 /* NOTE: Please look at
  * Lancer.java first!
  */

class Main {
  public static void main(String[] args) {
      // CREATE LANCER OBJECTS

      /* PROBLEM 2:
       * First, analyze the
       * Lancer object creation
       * for Jane Doe. Then,
       * follow the directions
       * below to create your own
       * object for yourself.
       */

      // Lancer #1: Jane Doe
      Lancer jd = new Lancer("Jane", "Doe", "Biology", "Environmental Club", 111, 2020);
      jd.introduce();
      jd.add_course("AP Calculus AB");
      jd.add_course("Intro to CS");
      jd.check_schedule();
      jd.cheer();

      // Lancer #2: You!

      /* Use the template above to help you do the following:
      1. Create a Lancer object for yourself. See the Lancer constructor given above.
      2. Call on the introduce method to greet your classmates.
      3. Call on the add_course method 6 times to add the rest of your courses for the 2019-2020 school year.
      4. Call on the check_schedule method to see all your courses.
      5. Show your school pride & call on the cheer method. */

      /* When you have finished
       * creating your
       * additional Lancer, the
       * test below should
       * output 2. */
       Lancer llv = new Lancer("Lino", "Le Van", "Intro to Computer Science", "3D Printing Club", 402, 2022);
       llv.introduce();
       llv.add_course("English 2");
       llv.add_course("AP Calculus AB");
       llv.add_course("Chemistry Honors");
       llv.add_course("World History");
       llv.add_course("LTHL");
       llv.add_course("French 3");
       llv.check_schedule();
       llv.cheer();
      System.out.println("Number of Lancers: " + Lancer.numStudents);
  }
}
