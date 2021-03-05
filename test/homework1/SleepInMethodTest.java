package homework1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SleepInMethodTest {

    @Test
    public void shouldSleepInOnVacationDuringTheWeek() {
        assertTrue(SleepInMethod.sleepIn(true, true));
    }

    @Test
    public void shouldSleepInOnVacationDuringTheWeekend() {
        assertTrue(SleepInMethod.sleepIn(false, true));
    }

    @Test
    public void shouldSleepInOnWeekendNotVacation() {
        assertTrue(SleepInMethod.sleepIn(false, false));
    }

    @Test
    public void shouldNotSleepInOnWeekdayNotVacation() {
        assertFalse(SleepInMethod.sleepIn(true, false));
    }

}
