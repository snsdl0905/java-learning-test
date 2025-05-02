import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void addingTest(){
        assertAll("덧셈 테스트",
                () -> assertEquals(5, calc.add(2, 3)),
                () -> assertEquals(3, calc.add(6, -3)),
                () -> assertEquals(-5, calc.add(-2, -3))
        );
    }

    @Test
    void SubtractingTest(){
        assertAll("뺄셈 테스트",
                () -> assertEquals(2, calc.subtract(5, 3)),
                () -> assertEquals(8, calc.subtract(3, -5)),
                () -> assertEquals(-5, calc.subtract(-2, 3)),
                () -> assertEquals(-2, calc.subtract(4, 6))
        );

    }

    @Test
    void multiplyingTest(){
        assertAll("곱셈 테스트",
                () -> assertEquals(6, calc.multiply(2, 3)),
                () -> assertEquals(-8, calc.multiply(-4, 2)),
                () -> assertEquals(6, calc.multiply(-2, -3))
        );

    }

    @Test
    void dividingTest(){
        assertAll("나눗셈 테스트",
                () -> assertEquals(1, calc.divide(3, 2)),
                () -> assertEquals(2, calc.divide(-6, -3)),
                () -> assertEquals(-1, calc.divide(2, -3))
        );
    }
}
