public class Printoops4 {
    public static void main(String[] args) {

        String[] banner = {
            String.join("   ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ***** "),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *"),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "****** ",
                    " ***** "),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"),

            String.join("   ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "*     *"),

            String.join("   ",
                    " ***** ",
                    " ***** ",
                    "*      ",
                    " ***** ")
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}