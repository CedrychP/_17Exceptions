public class SumTextArgsV4 {

  public static void main(String[] args) {
    String[] elements = {"1", "2", "3", "vier"};

    try {
      int sum = sumIt(elements);
      System.out.println("Summe: " + sum);
    } catch (MyException e) {
      System.err.println(e.getMessage());
    } catch (NumberFormatException e) {
      System.err.println("NumberFormatException: " + e.getMessage());
    }
  }

  public static int sumIt(String[] s) throws MyException {
    int sum = 0;
    for (int i = 0; i < s.length; i++) {
      try {
        if (s[i].equals("vier")) {
          throw new MyException("Ungültiger Wert 'vier' an Index " + i);
        }
        sum += Integer.parseInt(s[i]);
      } catch (NumberFormatException e) {
        throw new MyException("Fehler beim Parsen an Index " + i + ": " + s[i]);
      }
    }
    return sum;
  }
}