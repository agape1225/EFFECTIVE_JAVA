import java.util.regex.Pattern;

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile("");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    private static long sum() {
        Long sum = 0L;
        for(long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }
}
