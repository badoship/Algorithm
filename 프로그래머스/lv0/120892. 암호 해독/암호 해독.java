import java.util.stream.*;
class Solution {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(value -> (value+1) % code == 0)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }
}