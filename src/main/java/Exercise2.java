public class Exercise2 {

    public static boolean leap_years(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public static void main(String[] args) {
        int year = 2000;

        if (leap_years(year)) {
            System.out.println(year + " is a Leapyear");
        } else {
            System.out.println(year + " is not a Leapyear");
        }

    }
}
