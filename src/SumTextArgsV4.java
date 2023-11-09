public class SumTextArgsV3 {

  public static void main(String[] args) {
    String[] elements = {"1", "2", "3", "vier"};

    try {
      int sum = sumIt(elements);
      System.out.println("Summe: " + sum);
    } catch (MyException e) {
      System.err.println(e.getMessage());
    }
  }

  public static int sumIt(String[] s) throws MyException {
    int sum = 0;
    for (String element : s) {
      try {
        sum += Integer.parseInt(element);
      } catch (NumberFormatException e) {
        throw new MyException("Fehler beim Parsen: " + element);
      }
    }
    return sum;
  }
}