package arrays_and_hashing.medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {
    public static String encode(List<String> strs) {
        for(String str : strs){
            switch (str.length() % 3){
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
                default:

                    break;
            }
        }
        return String.join(" ", strs);
    }

    public static List<String> decode(String str) {

        return new ArrayList<>();
    }
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
        sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
}

    public static String encodeMethod1(String str) {
    return str.length() + "#" + str;
}

    public static String encodeMethod2(String str) {
    return str.replace("\\", "\\\\").replace("|", "\\|");
}

public static String encodeMethod3(String str) {
    int len = str.length();
    char[] prefix = {
        (char)((len >> 24) & 0xFF), (char)((len >> 16) & 0xFF),
        (char)((len >>  8) & 0xFF), (char)( len        & 0xFF)
    };
    return new String(prefix) + str;
}

}
