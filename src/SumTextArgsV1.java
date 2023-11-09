public class SumTextArgsV1 {

  public static void main(String[] args) {
    String[] elements = {"1", "2", "3", "vier"};

    int sum = 0;
    for (String element : elements) {
      sum += Integer.parseInt(element);
    }

    System.out.println("Summe: " + sum);
  }
}