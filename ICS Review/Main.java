import java.util.*;

class Main {
  public static void main(String[] args) {
    //Problem 1
    hello_repeat("GlaDOS", 3);
    System.out.println("###");
    hello_repeat("Pewdiepie", 0);
    System.out.println("###");

    //Problem 2
    System.out.println(star_str("Portal"));
    System.out.println("###");
    System.out.println(star_str(""));
    System.out.println("###");

    //Problem 3
    countdown_by_2(8.25);
    System.out.println("###");
    countdown_by_2(7);
    System.out.println("###");
    countdown_by_2(6);
  }

  // Problem 1
  public static void hello_repeat(String name, int num) {
    String newString = "";
    for(int i = 0;i<num;i++){
      newString+="Hello, "+name+"! ";
    }
    System.out.println(newString);
  }

  // Problem 2
  public static String star_str(String input) {
    String newString = "";
    for(int i = 0;i<input.length();i++){
      newString+=input.charAt(i)+"*";
    }
    return(newString);
  }

  // Problem 3
  public static void countdown_by_2(double num) {
    double rc = num;
    while(Math.floor(rc)>=0){
      System.out.println(rc);
      rc-=2;
    }
  }

}
