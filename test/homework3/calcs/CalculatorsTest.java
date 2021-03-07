package homework3.calcs;

import homework3.calcs.additional.*;
import homework3.calcs.api.ICalculator;
import homework3.calcs.simple.CalculatorWithMathCopy;
import homework3.calcs.simple.CalculatorWithMathExtends;
import homework3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorsTest {

    @ParameterizedTest
    @MethodSource("calculatorsProvider")
    @DisplayName("Деление")
    public void checkDivision(ICalculator calc){
        assertEquals(5.6,calc.divide(28, 5));
    }

    @ParameterizedTest
    @MethodSource("calculatorsProvider")
    @DisplayName("Умножение")
    public void checkMultiplication(ICalculator calc){
        assertEquals(105,calc.multiply(15, 7));
    }

    @ParameterizedTest
    @MethodSource("calculatorsProvider")
    @DisplayName("Сложение")
    public void checkAddition(ICalculator calc){
        assertEquals(109.1,calc.plus(105, 4.1));
    }

    @ParameterizedTest
    @MethodSource("calculatorsProvider")
    @DisplayName("Вычитание")
    public void checkSubtraction(ICalculator calc){
        assertEquals(22,calc.minus(24, 2));
    }

    @ParameterizedTest
    @MethodSource("calculatorsProvider")
    @DisplayName("Возведение в степень")
    public void checkExponentiation(ICalculator calc){
        assertEquals(31.359999999999996,calc.pow(5.6, 2));
    }

    @ParameterizedTest
    @MethodSource("calculatorsProvider")
    @DisplayName("Модуль числа")
    public void checkAbsoluteValue(ICalculator calc){
        assertEquals(45,calc.abs(-45));
    }

    @ParameterizedTest
    @MethodSource("calculatorsProvider")
    @DisplayName("Корень")
    public void checkMathematicalRoot(ICalculator calc){
        assertEquals(7,calc.sqrt(49));
    }

    static Stream<Arguments> calculatorsProvider(){
        return Stream.of(
                arguments(new CalculatorWithMathCopy()),
                arguments(new CalculatorWithMathExtends()),
                arguments(new CalculatorWithOperator()),
                arguments(new CalculatorWithCounterAutoSuper()),
                arguments(new CalculatorWithCounterClassic())
        );
    }
}
