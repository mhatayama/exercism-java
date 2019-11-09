import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {
    String acronym;

    Acronym(String phrase) {
        this.acronym = calcAcronym(phrase);
    }

    String get() {
        return acronym;
    }

    String calcAcronym(String phrase) {
        String[] words = phrase.toUpperCase().split("[\\s\\-\\_]");
        return Arrays.stream(words).map(w ->
            w.isEmpty() ? "" : w.subSequence(0, 1)
        ).collect(Collectors.joining());
    }

}
