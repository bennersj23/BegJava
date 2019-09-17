/*
Making a traingle
9/13/19
Jackson Benners
 */

public class Stars {
    public static final int count = 6;

    public static void main(String[] args) {
        for (int line = 1; line <= count; line++) {
            for (int space = 0; space < -line + count; space++) {
                System.out.print(" ");
            }
                for (int counter = 0; counter < line; counter++) {

                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
