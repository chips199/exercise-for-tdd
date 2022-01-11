import java.util.Arrays;

public class Exercise1 {

    public static int sum(String input) {
        String[] inputs=input.split(",");
        if (input.equals("")) {
            return 0;
        }
        if (inputs.length == 1) {
            return Integer.parseInt(inputs[0]);
        }
        if (inputs.length == 2) {
            return Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);
        }
        return Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]) + Integer.parseInt(inputs[2]);
    }

    public static void main(String[] args) {
    String input = "";

    int result = sum(input);

    System.out.printf("%s = %d", input, result);
    }
}
