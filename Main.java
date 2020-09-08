class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalCandies;
    double blueCandies;
    double brownCandies;
    double greenCandies;
    double orangeCandies;
    double redCandies;
    double yellowCandies;
    double sumOfCandies;

    totalCandies = 55 * 10;
    blueCandies = totalCandies * .24;
    brownCandies = totalCandies * .13;
    greenCandies = totalCandies * .16;
    orangeCandies = totalCandies * .20;
    redCandies = totalCandies * .13;
    yellowCandies = totalCandies * .14;
    sumOfCandies = blueCandies + brownCandies + greenCandies + orangeCandies + redCandies + yellowCandies;

    System.out.println("blue: " + blueCandies);
    System.out.println("brown: " + brownCandies);
    System.out.println("green: " + greenCandies);
    System.out.println("orange: " + orangeCandies);
    System.out.println("red: " + redCandies);
    System.out.println("yellow: " + yellowCandies);
    System.out.println("Sum: " + sumOfCandies);

    if ( blueCandies > brownCandies && greenCandies > orangeCandies)
     System.out.println("Blue over Brown and Green over Orange");

    if ( brownCandies <= redCandies)
     System.out.println("Brown is less than or equal to Red");

    if ( sumOfCandies == totalCandies)
     System.out.println("Numbers match");
  }
}