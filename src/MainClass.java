
import java.util.Scanner;

    public class MainClass {

        static int UserInput;

        public static void main(String[] args) {
            System.out.print("Enter the number: ");
            Scanner s = new Scanner(System.in);
            UserInput = s.nextInt();
            boolean FinalResult = IsPalindrome(UserInput);
            if (FinalResult == true) {
                System.out.println(UserInput + " Is a Palindrome.");
            } else if (FinalResult == false) {
                System.out.println(UserInput + " Is NOT a Palindrome.");
            }
        }

        //Function for reversing string entries.
        static String ReverseString(String value) {
            byte[] strAsByteArray = value.getBytes();
            byte[] result = new byte[strAsByteArray.length];
            // Store result in reverse order into the
            // result byte[]
            for (int i = 0; i < strAsByteArray.length; i++) {
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            }
            return new String(result);
        }

        //Function for converting a numeric value to String.
        static String IntToString(int value) {
            return String.valueOf(value);
        }

        //Function for converting a String value to a number.
        static int StringToInt(String value) {
            return Integer.parseInt(value);
        }

        //Function for checking if the number is palindromic.
        static boolean IsPalindrome(float value) {
            String IntString = IntToString(UserInput);
            String ReversedValue = ReverseString(IntString);
            return ReversedValue.equals(IntToString(UserInput));

        }
    }


