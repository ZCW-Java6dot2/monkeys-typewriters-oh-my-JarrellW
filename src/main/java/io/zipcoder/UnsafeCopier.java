package io.zipcoder;

import java.util.Random;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        Random random = new Random();
        String next = "";
        while(stringIterator.hasNext()){
            try {
                next += stringIterator.next() + "";
                Thread.sleep(random.nextInt((250 - 50)+1)+50);
                copied += next;
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        copied = copied.trim();
    }
}
