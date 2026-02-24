public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] letterO = buildO();
        String[] letterP = buildP();
        String[] letterS = buildS();

        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = letterO[i] + "   " +
                             letterO[i] + "   " +
                             letterP[i] + "   " +
                             letterS[i];
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    public static String[] buildO() {
        return new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
    }

    public static String[] buildP() {
        return new String[]{
                "****  ",
                "*   * ",
                "*   * ",
                "****  ",
                "*     ",
                "*     ",
                "*     "
        };
    }

    public static String[] buildS() {
        return new String[]{
                " **** ",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                " **** "
        };
    }
}