package lesson1;

import static java.awt.Color.yellow;

public class HomeWorkApp {
    public static void main(String[] args) {
      printThreeWords();
      checkSumSign();
      printColor();
      compareNumbers();


}
    public static void printThreeWords() {
      System.out.println("Orange");
      System.out.println("Banana");
      System.out.println("Apple");
}
    public static void checkSumSign() {
      int sumA = 7;
      int sumB = 6;
      System.out.println(sumA + sumB);
  }
    public static void printColor() {
       int valueA = 33;
        System.out.println(valueA);
    }
    public static void compareNumbers() {
        int numA = 38;
        int numB = 45;
        System.out.println(numA < numB);
    }

}
