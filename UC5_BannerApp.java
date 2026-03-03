/**
 * UC5 - Render OOPS Banner using Inline Array Initialization with String.join() and enhanced for-loop
 */
public class UC5_BannerApp {
    public static void main(String[] args) {

        String[] lines = {
                "  ***    ***    *****   ***** ",
                " *   *  *   *   *    *  *     ",
                "*     **     *  *    *  *     ",
                "*     **     *  *****   ***** ",
                "*     **     *  *           * ",
                " *   *  *   *   *           * ",
                "  ***    ***    *       ***** "
        };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
