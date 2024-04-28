import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            int number = input.nextInt();

            if (isPerfectNumber(number)) {
                System.out.println(number + " Mükemmel sayıdır.");
            } else {
                System.out.println(number + " Mükemmel sayı değildir.");
            }
        }
    }

    static boolean isPerfectNumber(int number) {
        int sum = 0;
        // Finding the sum of positive integer divisors (excluding the number itself) of the given number.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        // If the sum is equal to the number, then it is a perfect number.
        return sum == number;
    }
}
