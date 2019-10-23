package mycodes;

import java.util.Random;

public class WarmUp {

    private static Random sRandom = new Random();
    private static char[] sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiopasdfghjklzxcvbnm".toCharArray();

    public static String sAlphabet(int length) {
        String str = "";
        for (int x = 0; x < length; x++) {
            int a = sRandom.nextInt(50);
            char s = sAlphabet[a];
            str += s;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(sAlphabet(20));
    }
}