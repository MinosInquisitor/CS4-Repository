public class Main {
// dont mind my atrocious code, idk what im doing
  static String introName = "Name: ";
  static String introAge = "Age: ";
  static String name1 = "Jeri";
  static int x = 16;
  static String status = "Dormer: ";
  static boolean dormer = true;
  static String introAnime = "Favorite Animes: ";
  static String favAnime1 = "Made in Abyss, ";
  static String favAnime2 = "Bloom into You\n";
  static String Yes = "Yes";
  static String funnystring = "My attempt at making 3 operations:";
  static String ageaddone = "My age + 1: ";
  static int ageplusone = x+1;
  static String question = "Is my Age at the age of consent? ";
  static String agesubone = "My age - 1: ";
  static double ageminusone = x-1;

  public static void main(String[] args) { 

    System.out.println(introName + name1);
    System.out.println(introAge + x);
    System.out.println(status + dormer);
    System.out.println(introAnime + favAnime1 + favAnime2);

    System.out.println(funnystring);
    System.out.println(ageaddone + ageplusone);
    System.out.print(question);
    if (x>=16) {
    System.out.println(Yes);
    }
    System.out.println(agesubone + ageminusone);

  }
}