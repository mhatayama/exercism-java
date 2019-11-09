import java.util.Arrays;
import java.util.List;

class ReverseString {

    String reverse(String inputString) {
        List<String> strs = Arrays.asList(inputString.split(""));
        return strs.stream().reduce((e1, e2) -> e2.concat(e1)).get();
    }
}