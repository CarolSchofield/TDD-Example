package check_result;

import org.junit.Test;

import static check_result.Factorial.factorial;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void shouldReturnOneWhenNumberIsOne(){
        assertThat(factorial(1), is(1));
    }
}
