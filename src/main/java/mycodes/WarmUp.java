package mycodes;

import java.util.Random;

public class WarmUp {

    private static Random sRandom = new Random();
    private static char[] sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiopasdfghjklzxcvbnm".toCharArray();
    private static int sLength = sAlphabet.length;


    /*public static  getRandomChar() {
        return sAlphabet[sRandom.nextInt(sLength)];
    }*/

    public static String sAlphabet(int length) {

        String str ="";
        for (int x = 0; x <= length; x++) {
            int a = sRandom.nextInt(51);
            char s = sAlphabet[a];
            str+=s;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(sAlphabet(20));
    }
}