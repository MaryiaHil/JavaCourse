package homework1;


public class PhoneNumberFormatter {
    public static String createPhoneNumber(int[] arr) {
        // Check that the size of the array is 10
        if (arr.length != 10) {
            return "Wrong phone number. The amount of digits should be 10";
        }
        for (int i : arr) {
            // Check that each array value is a digit (between 0 and 10)
            if (i < 0 || i >= 10) {
                return "Wrong phone number. The amount of digits should be 10";
            }

        }
        // Format the array in the following manner (XXX) XXX-XXXX
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", arr[0], arr[1], arr[2], arr[3],
                arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);

    }

    public static void main(String[] args) {
        int[] phone1 = {0, 2, 9, 2, 8, 1, 2, 8, 3, 3};
        String number1 = createPhoneNumber(phone1);
        System.out.println(number1);
    }

}
