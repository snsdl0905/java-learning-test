package test;

import calculator.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();
    @Test
    void defaultDelimiterTest(){
        assertAll("기본 구분자 테스트",
                () -> assertEquals(8, stringCalculator.calculate("1.3:4")),
                () -> assertEquals(4, stringCalculator.calculate("1:1:2"))
                );
    }
    @Test
    void customDelimiterTest(){
        assertAll("커스텀 구분자 테스트",
                () -> assertEquals(13, stringCalculator.calculate("//@\n1.3:4@5")),
                () -> assertEquals(25, stringCalculator.calculate("//##\n1##1##21.2"))
        );
    }
}
