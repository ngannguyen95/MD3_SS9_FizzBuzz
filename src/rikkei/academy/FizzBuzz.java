package rikkei.academy;

public class FizzBuzz {
    public static String translate(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                return "FizzBuzz";
            } else return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }
//    public static String FizzBuzzTranslate(int number){
//        String numberString=String.valueOf(number).replace("");
//        String
//    }
}
