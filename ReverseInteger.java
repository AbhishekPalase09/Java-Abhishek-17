public class ReverseInteger {

    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;      // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;            // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
