package utils;

import java.util.Arrays;

public class Randomizer {
    protected int num;
    private final int[] nlist;
    private final int amount;
    private int count = 0;
    private boolean check, checkOk;

    public Randomizer(int amount) {
        this.amount = amount;
        nlist = new int[amount + 1];
//        randomNumber();
    }

    public void randomNumber() {
        checkOk = false;
        do {
            check = false;
            num = 1 + (int) (Math.random() * (amount));
            for (int i = 0; i < nlist.length; i++) {
                if (nlist[i] == num) {
                    check = true;
                    break;
                }
            }
            if (count == amount) {
                Arrays.fill(nlist, 0);
                count = 0;
                nlist[count] = num;
                count++;
                checkOk = true;
            } else if (!check) {
                nlist[count] = num;
                count++;
                checkOk = true;
            }
        } while (!checkOk);
    }

    public int getIndex() {
        return num;
    }
}
