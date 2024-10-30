import java.util.Scanner;

public class number_to_words_converter {

  private static final String[] NUM_NAMES = {
      "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
      "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
      "seventeen", "eighteen", "nineteen"
  };

  private static final String[] TENS_NAMES = {
      "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
  };

  private static final String[] THOUSANDS_NAMES = {
      "", "thousand", "million"
  };

  private static String convertLessThanOneThousand(int number) {
    if (number == 0)
      return "";
    if (number < 20)
      return NUM_NAMES[number];
    int tens = number / 10;
    int ones = number % 10;
    return TENS_NAMES[tens] + (ones > 0 ? "-" + NUM_NAMES[ones] : "");
  }

  public static String convertNumberToWords(int number) {
    if (number == 0)
      return NUM_NAMES[0];
    if (number < 0)
      return "minus " + convertNumberToWords(-number);

    String words = "";
    int groupIndex = 0;

    while (number > 0) {
      int group = number % 1000;
      if (group > 0) {
        words = convertLessThanOneThousand(group) + " " + THOUSANDS_NAMES[groupIndex] + (words.isEmpty() ? "" : ", ")
            + words;
      }
      number /= 1000;
      groupIndex++;
    }

    return words;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a number: ");
      int number = sc.nextInt();
      System.out.println(convertNumberToWords(number));
    }
  }
}
