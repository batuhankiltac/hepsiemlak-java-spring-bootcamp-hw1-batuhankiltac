import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Long> arrayList = new ArrayList<>();
    static Long total;
    static Long maxNumber1;
    static Long maxNumber2;

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {

        for (long i = 10; i <= 100; i++) {
            total = i + reversed(i);
            while (!isPalindrome(total)) {
                total += reversed(total);
                arrayList.add(total);
            }
            System.out.println("Number = " + i + ", " + " Max Palindrome Value: " + total);
        }
        Collections.sort(arrayList);
        maxNumber1 = arrayList.get(arrayList.size() - 1);
        System.out.println("\nMax value in array: " + maxNumber1);
        maxNumber2 = arrayList.get(arrayList.size() - 2);
        System.out.println("Max value in array: " + maxNumber2);
    }

    public static long reversed(long number) {
        long reversedNumber = 0;
        long lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(long number) {
        long originalNumber = number;
        long reversedNumber = 0;
        long lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        return reversedNumber == originalNumber;
    }
}