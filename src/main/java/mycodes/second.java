package mycodes;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class second {

    public static void main(String[] args) {
      int[] a = new int[100];
    Random random = new Random();
        int rnd1 = random.nextInt();
        System.out.println(rnd1);
        WarmUp w = new WarmUp();
        String s1 = w.sAlphabet(13);
        System.out.println(s1);
    }

}