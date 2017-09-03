package com.borka;

import java.util.Random;

public class Main {

    static int[] myNum = {3, 7, 18, 22, 35, 14};
    static int[] lotto = new int[6];
    static int myExtra = 4;
    static int extra;
    static int numberOfGuesses = 0;

    public static void main(String[] args) {

        lotto = generateNumbersForLotto();
        System.out.println("Dispaly your numbers:");
        printLotto(myNum);
        System.out.println("\n" + "Dispaly lotto numbers:");
        printLotto(lotto);
        System.out.println("");
        numberOfGuesses = checkLottery();
        generateExtraNumber();
        boolean guessExtra = (myExtra == extra);


        System.out.println("you have gueessed " + numberOfGuesses + " from " + lotto.length + " numbers");
        System.out.println(guessExtra ? "you guessed extra " + extra : "you din't guess extra");

    }

    public static int[] generateNumbersForLotto() {
        int temp;
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
              temp = random.nextInt(36) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[j] == temp) {
                    temp = random.nextInt((36) + 1);
                    j=-1;
                }
                     }
            lotto[i] = temp;
        }
        return lotto;

    }

    public static int checkLottery() {
        for (int i = 0; i < lotto.length; i++) {

            int dig = lotto[i];

            for (int j = 0; j < myNum.length; j++) {
                if (dig == myNum[j])
                    numberOfGuesses++;
            }
        }
        return numberOfGuesses;
    }

    public static void printLotto(int[] lotto) {
        for (Integer curr : lotto
                ) {
            System.out.print(curr + "\t");

        }
    }

    public static void generateExtraNumber() {
        Random random = new Random();
        extra = random.nextInt((8) + 1);
    }
}