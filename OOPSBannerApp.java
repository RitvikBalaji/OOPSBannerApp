import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        }));

        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
                "****  ",
                "*   * ",
                "*   * ",
                "****  ",
                "*     ",
                "*     ",
                "*     "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
                " **** ",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                " **** "
        }));

        String word = "OOPS";

        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternLibrary.get(ch).getPattern();
                lineBuilder.append(pattern[i]).append("   ");
            }

            bannerLines[i] = lineBuilder.toString();
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}