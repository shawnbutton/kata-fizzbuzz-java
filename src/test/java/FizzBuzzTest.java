import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  public void setup() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void given_1_should_say_1() {
    assertEquals("1", fizzBuzz.say(1));
  }

  @Test
  public void given_2_should_say_2() {
    assertEquals("2", fizzBuzz.say(2));
  }

  @Test
  public void given_3_should_say_fizz() {
    assertEquals("fizz", fizzBuzz.say(3));
  }

  @Test
  public void given_4_should_say_4() {
    assertEquals("4", fizzBuzz.say(4));
  }

  @Test
  public void given_5_should_say_buzz() {
    assertEquals("buzz", fizzBuzz.say(5));
  }

  @Test
  public void given_6_should_say_fizz() {
    assertEquals("fizz", fizzBuzz.say(6));
  }

  @Test
  public void given_10_should_say_buzz() {
    assertEquals("buzz", fizzBuzz.say(10));
  }

  @Test
  public void given_15_should_say_fizzbuzz() {
    assertEquals("fizzbuzz", fizzBuzz.say(15));
  }

  @Test
  public void given_0_should_say_not_allowed(){
    try {
      fizzBuzz.say(0);
      fail("Should have thrown an exception");
    } catch (Exception ex) {
      //expected exception
    }
  }
}
