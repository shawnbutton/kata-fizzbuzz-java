public class FizzBuzz {
  public String say(int number) {

    if (number ==0) throw new RuntimeException();

    StringBuffer whatToSay = new StringBuffer();

    if (isDivisibleBy3(number)) whatToSay.append("fizz");

    if (isDivisibleBy5(number)) whatToSay.append("buzz");

    if (isEmpty(whatToSay)) return String.valueOf(number);

    return whatToSay.toString();
  }

  private boolean isEmpty(StringBuffer whatToSay) {
    return whatToSay.toString().isEmpty();
  }

  private boolean isDivisibleBy5(int number) {
    return number % 5 == 0;
  }

  private boolean isDivisibleBy3(int number) {
    return number % 3 == 0;
  }
}
