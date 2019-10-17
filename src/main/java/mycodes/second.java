package mycodes;


import java.util.Random;
public class second {


    public static void main(String[] args) {

    Random random = new Random();
        for (int i = 10; i < 20; i++) {
            int rnd2 = random.nextInt(10)+11;
            System.out.printf("Your random number is: %d\n", rnd2);

    }}}