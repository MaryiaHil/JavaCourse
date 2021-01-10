package homework1;

public class SleepInMethod2 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean sleepInPossibility = sleepIn(true, true);
        if(sleepInPossibility){
            System.out.println("You can sleep in.");
        } else {
            System.out.println("You should go to work.");
        }

    }
}
