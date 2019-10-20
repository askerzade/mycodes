public class envelope1 {

    public static void main(String[] args) {
        int length = 8;
        int width = 8;
        for (int x = 0; x < 8; x++) {
            System.out.println();
            for (int y = 0; y < 8; y++) {
                if (y == 0 || y == length - 1 || x == 0 || x == width - 1
                        ||  y == x
                        || x+y == 7
                )
                    System.out.print("*");
                else System.out.print(" ");
            }
        }

    }
}

