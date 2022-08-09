public class FizzBuzz {
  public String say(int number) {

    assert (number != 0);

    String whatToSay = checkForFizzAndBuzz(number);

    if (whatToSay.isEmpty()) whatToSay = String.valueOf(number);

    return whatToSay;
  }

  private String checkForFizzAndBuzz(int number) {
    StringBuffer whatToSay = new StringBuffer();

    if (isDivisibleBy(number, 3)) whatToSay.append("fizz");

    if (isDivisibleBy(number, 5)) whatToSay.append("buzz");

    return whatToSay.toString();
  }

  private boolean isDivisibleBy(int number, int divisibleBy) {
    return number % divisibleBy == 0;
  }
}
