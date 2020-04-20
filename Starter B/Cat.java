class Cat {
    /* PROBLEM 1:
    * Create 2 static variables
    * numCats & numPaws, which
    * keep track of the total
    * number of cats created by * the class & the total
    * number of paws.
    *
    * Create instance variables
    * which keep track of a
    * specific Cat's attributes: * name, breed, owner,
    * favorite thing, phrase,
    * and a hunger level (which
    * is an integer: 0, 1, 2, or * 3).
    *
    * For each variable,
    * declare its type. */

    // PLACE CLASS VARIABLES BELOW THIS LINE
    public static int numCats = 0;
    public static int numPaws = 0;
    // PLACE INSTANCE VARIABLES BELOW THIS LINE
    private String name;
    private String breed;
    private String owner;
    private String favoriteThing;
    private String phrase;
    private int hungerLevel;

    public Cat (String n, String b, String o, String f, String p, int hl) {
        /* PROBLEM 2:
        Each instance variable from above should be set equal
        to the respective input variable in this constructor.

        Example -> name = n;

        Write 5 other similar statements for the other instance
        variables. Make sure to add the given statement too.

        Since this is where a Cat object gets created, make sure
        to increase the total number of Paws (numPaws) by 4. Also,
        make sure to increase the total number of cats.

        SEE MAIN METHOD for rest of PROBLEM 2. */
        name = n;
        breed = b;
        owner = o;
        favoriteThing = f;
        phrase = p;
        hungerLevel = hl;
        numCats++;
        numPaws+=4;
    }

    public void show_and_tell() {
        /* PROBLEM 3:
        Fill in this constructor so that you can bring your
        Cat to show and tell and tell the audience about it.

        Here is an expected behavior example for NyanCat
        (Note that each statement is *printed* on a new line):

        Hi! My name is Internetz
        This is my cat NyanCat
        His favorite thing is Rainbows
        He is a type of Pop Tart
        ***

        SEE MAIN METHOD for rest of PROBLEM 3. */
        System.out.println("Hi! My name is "+owner);
        System.out.println("This is my cat "+name);
        System.out.println("His favorite thing is "+favoriteThing);
        System.out.println("He is a type of "+breed);
        System.out.println("***");
    }

    public void feed() {
        /* PROBLEM 4:
        Fill in this method to feed the Cat if it is hungry.

        If a Cat's hunger level is below 3, this statement should
        be printed: "(name) is not hungry."

        Otherwise (hunger is 3 or more), this statement should be
        printed: "(name) has been fed." & its hunger level should be
        set back to 0.

        SEE MAIN METHOD for rest of PROBLEM 4. */
        if(hungerLevel<3){
          System.out.println(name+" is not hungry");
        }else{
          hungerLevel=0;
          System.out.println(name+" has been fed.");
        }
    }

    public void play(Cat otherCat) {
        /* PROBLEM 5:
        Fill in this method to allow Cats to play with each other.

        IMPORTANT: First edit the input so that it takes in a
        variable called otherCat with data type Cat.

        This method should print out the statement:
        "(OtherCat's name) is playing with (name)."
        Hint: You will need to use dot notation (to use the
        other cat's name in your string).

        Increase the hunger level by 1 for both cats.
        Hint: Again, you will need to use dot notation (to
        increase the other cat's hunger).

        SEE MAIN METHOD for rest of PROBLEM 5. */
        System.out.println(otherCat.name+" is playing with "+name);
        otherCat.hungerLevel++;
        hungerLevel++;
    }

    public void meow() {
        /* PROBLEM 6:
        Print out the cat's phrase.

        SEE MAIN METHOD for rest of PROBLEM 6. */
        System.out.println(phrase);
    }

    /* PROBLEM 7:
    For the following 3 getter methods, do the following:
    1. Change the return type to int.
    2. Return the class or instance variable needed.


    SEE MAIN METHOD for rest of PROBLEM 7.
    */

    public int get_hunger_level() {
      return(hungerLevel);
    }

    public static int get_total_paws() {
      return(numPaws);
    }

    public static int get_total_cats() {
      return(numCats);
    }
}
