public class Exercise1 {

    public static double sum(String input) {
        if (input.equals("")) {
            return 0;
        }
        String[] numbers = input.split(",");
        double sum = 0;
        for (String number: numbers) {
            sum += Double.parseDouble(number);
        }
        return sum;
    }

    public static void main(String[] args) {
    String input = "";

    double result = sum(input);

    System.out.printf("%s = %d", input, result);
    }
}
