package utils;

import java.util.Arrays;

public class Randomizer {
    protected int num;
    private int [] nlist;
    private int amount;
    private int count;
    private boolean check, checkOk;

    public Randomizer(int amount) {
        this.amount = amount;
        nlist = new int[amount];
    }

    public Randomizer(int amount,int [] nlist,int count) {
        this.amount = amount;
        this.nlist = nlist;
        this.count = count;
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
    public int getCount() {
        return  count;
    }
    public int [] getNlist() {return nlist;}
}