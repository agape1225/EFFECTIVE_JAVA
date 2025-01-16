import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexion dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
}

String s1 = new String("bikini");
String s2 = "bikini";