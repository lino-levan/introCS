import java.util.*;

// SECTION A: LANCER CLASS

class Lancer {
    /* PROBLEM 1:
     * First, analyze the code
     * below for the Lancer
     * class. Then, answer these * questions (type your
     * answers for each Q):

    1. How many input variables are there?
    There are 6 input variables

    2. How many class (static) variables are there?
    There are 4 static variables

    3. How many instance (nonstatic) variables are there?
    There are 7 instance variables

    4. How many inputs are taken by the Lancer constructor method?
    There are 6 inputs that can be taken by the Lancer constructor method.

    5. What is the data type of the schedule variable?
    The datatype of the schedule variable is ArrayList

    6. Where (in which method) does a Lancer's favorite
    course get placed onto their schedule?
    The Lancer's favorite course gets added in the constructor

    7. Where (in which method) are all other courses
    placed onto a Lancer's schedule?
    The rest of the Lancer's schedule is added through the add_course method.

    8. Why do we increase the number of students inside
    the constructor instead of at the class level?
    Each time a new student is created (through the constructor), we want to add it, so doing it in the constructor is the only thing that makes sense.
    */

    static String school = "Saint Francis High School";
    static String tradition = "Holy Cross";
    static String patron = "St. Francis";
    static int numStudents;

    /* NOTE: In Mini-Lab 5.3,
     * we made a simple class
     * with fewer keywords used
     * in order to first
     * understand the basics.
     * Now, we add on a bit more
     * complexities.

    REVIEW:
    - Class (static) variables maintain a single shared value for all instances of the class
    - Use the static keyword to change an instance variable into a class variable.
    - Both instance and class variables are declared at the class level (class declaration), not within methods.
    */

    private String firstName;
    private String lastName;
    private String favCourse;
    private String favActivity;
    private int homeroom;
    private int year;
    // ArrayList acts much like a list structure from Snap!
    private ArrayList schedule = new ArrayList();

    public Lancer (String fn, String ln, String fc, String fa, int h, int y) {
        /* Construct a Lancer object. Initialize variables for use
        throughout the class. Increase the total number of Lancer
        objects by 1. */

        firstName = fn;
        lastName = ln;
        favCourse = fc;
        favActivity = fa;
        homeroom = h;
        year = y;
        schedule.add(fc);
        numStudents += 1;
    }

    public void introduce() {
        /* A Lancer object introduces herself or himself. Run the
        file to see the behavior in the interpreter. */

        System.out.println("Commence social interaction...");
        System.out.println("Hi, my name is " + firstName + " " + lastName);
        System.out.println("I attend " + school);
        System.out.println("Our school is founded on the " + tradition + " tradition");
        System.out.println("Our patron saint is " + patron);
        System.out.println("My favorite course is " + favCourse);
        System.out.println("I participate in " + favActivity);
        System.out.println("My homeroom is in Room #" + homeroom);
        System.out.println("I will graduate in " + year);
        System.out.println("***");
    }

    public void add_course(String courseName) {
        /* A Lancer adds a course to their own schedule. */
        schedule.add(courseName);
    }

    public void check_schedule() {
        /* A Lancer checks their schedule for the 2018-2019
        school year. Each course prints out on a different line. */
        System.out.println("Course Schedule 18-19: ");
        for (int i = 0; i < schedule.size(); i++) {
		        System.out.println(schedule.get(i));
		    }
    }

    public void cheer() {
        /* A Lancer shows school pride with a familiar cheer. */
        System.out.println("Go Lancers!");
    }
}
