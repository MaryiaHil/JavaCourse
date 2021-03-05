package homework1;

import java.util.Random;

public class SleepInMethod {

    public static void main(String[] args) {
        Random rand = new Random();
        boolean weekday = rand.nextBoolean();
        boolean vacation = rand.nextBoolean();

        if(sleepIn(weekday, vacation)){
            System.out.println("You can sleep in.");
        } else {
            System.out.println("You should go to work.");
        }
    }

    /**
     * Provides a quick decision of whether a person could sleep in or not, based on his/her vacation or weekday/weekend
     * @param weekday - boolean value, which defines if it's a working day
     * @param vacation - boolean value, which defines if it's a vacation day
     * @return a boolean value
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = false;
        if (vacation || !weekday){
            result = true;
        }
        return result;
    }
}
