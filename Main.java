package Esercitazione;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        int x = 0;
        int counter = 0;
        while (x != 1000) {
            x = generate(x);
            System.out.println("target" + x);
            counter = revert(x, counter);
            Thread.sleep(1000);
        }
    }

    public static int generate(int x) {
        x = (int) (Math.random() * 10);
        return x;
    }

    public static int revert(int x, int counter) {
        if (counter > x) {
            while (counter > x) {
                counter = counter - 1;
                System.out.println(counter);
            }
        } else {
            while (counter < x) {
                counter = counter + 1;
                System.out.println(counter);
            }


        }
        return counter;
    }
}



