package homework1;

public class SleepInMethod {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("You can relax and sleep in, buddy.");
            return true;
        } else {
            System.out.println("I'm afraid you should go to work.");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean publicHoliday = sleepIn(true, true);

    }
}
