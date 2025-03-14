public class EvenOddChecker {

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer: ");

v       while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid integer. Please try again.");
            System.out.print("Enter an integer: ");
            scanner.next();
        }

        number = scanner.nextInt();
        return number;
    }

        public static String checkEvenOrOdd(int number) {

        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        int number = getIntegerInput();

        String resultMessage = checkEvenOrOdd(number);

        System.out.println(resultMessage);
    }
}
