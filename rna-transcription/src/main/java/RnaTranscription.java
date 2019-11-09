import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class RnaTranscription {
    private static final Map<String, String> TRANS;
    static {
        TRANS = new HashMap<>();
        TRANS.put("G", "C");
        TRANS.put("C", "G");
        TRANS.put("T", "A");
        TRANS.put("A", "U");
    }

    String transcribe(String dnaStrand) {
        if (dnaStrand.isEmpty())
            return "";
        return Arrays.stream(dnaStrand.split("")).map(s ->
            TRANS.get(s)).collect(Collectors.joining());
    }

}
