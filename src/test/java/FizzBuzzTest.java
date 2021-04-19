
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.kata.FizzBuzz.fizzBuzz;
import static com.kata.FizzBuzz.frequencies;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private static final String EXPECTED_OUTPUT = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";

    @Test
    public void multiplesOf3_shouldReturnFizz() {
        assertThat(fizzBuzz(9), is("fizz"));
        assertThat(fizzBuzz(12), is("fizz"));
        assertThat(fizzBuzz(18), is("fizz"));
        assertThat(fizzBuzz(21), is("fizz"));
    }

    @Test
    public void multiplesOf5_shouldReturnBuzz() {
        assertThat(fizzBuzz(5), is("buzz"));
        assertThat(fizzBuzz(10), is("buzz"));
        assertThat(fizzBuzz(20), is("buzz"));
        assertThat(fizzBuzz(25), is("buzz"));
    }

    @Test
    public void multiplesOf15_shouldReturnFizzbuzz() {
        assertThat(fizzBuzz(15), is("fizzbuzz"));
        assertThat(fizzBuzz(45), is("fizzbuzz"));
        assertThat(fizzBuzz(60), is("fizzbuzz"));
        assertThat(fizzBuzz(75), is("fizzbuzz"));
    }

    @Test
    public void fizzBuzz_shouldReturnExpectedOutput() {
        List<Integer> list = IntStream.range(1, 21).distinct().boxed().collect(Collectors.toList());
        assertThat(fizzBuzz(list), is(EXPECTED_OUTPUT));
    }

}