import org.example.Greeting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UTest {

  @Test

    void greet(){

    //Arrange
    String name = "Bob.";
    String expected = "Hello, Bob.";

    //Act
    String actual = Greeting.greet(name);

    //Assert
    Assertions.assertEquals(expected, actual);

  }

  @Test
  void greetNull(){
    String name = null;
    String expected = "Hello, my friend.";

    String actual = Greeting.greet(name);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  void greetShout(){
    String name = "MASIH!";
    String expected = "HELLO, MASIH!";

    String actual = Greeting.greet(name);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  void greetTwoName(){
    String[] names = {"Masih", "Peter"};
    String expected = "Hello, Masih and Peter.";

    String actual = Greeting.greet(names);

    Assertions.assertEquals(expected, actual);

  }

  @Test
  void greetNamesSeparateCommas(){
    String[] names = {"Tobias", "Peter", "Henrik"};
    String expected = "Hello, Tobias, Peter and Henrik.";

    String actual = Greeting.greet(names);

    Assertions.assertEquals(expected, actual);

  }

  @Test
  void greetMixNames(){
    String[] names = {"Tobias", "PETER", "Henrik"};
    String expected = "Hello, Tobias and Henrik. AND HELLO PETER!";

    String actual = Greeting.greet(names);

    Assertions.assertEquals(expected, actual);
  }






}
