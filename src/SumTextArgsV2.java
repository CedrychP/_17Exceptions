public class SumTextArgsV2 {

  public static void main(String[] args) {
    String[] elements = {"1", "2", "3", "vier"};

    int sum = 0;
    for (String element : elements) {
      try {
        sum += Integer.parseInt(element);
      } catch (NumberFormatException e) {
        System.err.println("Fehler beim Parsen: " + element);
        e.printStackTrace();
      }
    }

    System.out.println("Summe: " + sum);
  }
}