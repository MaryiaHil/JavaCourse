package homework1;

import homework1.api.ICommunicationPrinter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CommunicatorsTest {

    @ParameterizedTest
    @MethodSource("communicatorProvider")
    public void checkWelcomeForAnastasyia(ICommunicationPrinter communicator) {
        assertEquals("Я тебя так долго ждала.", communicator.welcome("Анастасия"));
    }

    @ParameterizedTest
    @MethodSource("communicatorProvider")
    public void checkWelcomeForVasya(ICommunicationPrinter communicator) {
        assertEquals("Привет! \nЯ тебя так долго ждала.", communicator.welcome("Вася"));
    }

    @ParameterizedTest
    @MethodSource("communicatorProvider")
    public void checkWelcomeForOthers(ICommunicationPrinter communicator) {
        assertEquals("Добрый день, а Вы кто?", communicator.welcome("Рома"));
    }

    static Stream<Arguments> communicatorProvider() {
        return Stream.of(
                arguments(new IfCommunicator()),
                arguments(new IfElseCommunicator()),
                arguments(new SwitchCommunicator())
        );
    }
}
