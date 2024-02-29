package foods;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Food {
    public static ArrayList<AllFood> getAllFood() {
        String file = "com.SonOfThoy.app/foods/all.txt";
        String line;

        ArrayList<AllFood> tmp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                tmp.add(new AllFood(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return tmp;
    }

    public static ArrayList<ThaiFood> getThaiFood() {
        String file = "com.SonOfThoy.app/foods/th.txt";
        String line;

        ArrayList<ThaiFood> tmp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                tmp.add(new ThaiFood(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return tmp;
    }

    public static ArrayList<AsianFood> getAsianFood() {
        String file = "com.SonOfThoy.app/foods/as.txt";
        String line;

        ArrayList<AsianFood> tmp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                tmp.add(new AsianFood(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return tmp;
    }

    public static ArrayList<HealthyFood> getHealthyFood() {
        String file = "com.SonOfThoy.app/foods/health.txt";
        String line;

        ArrayList<HealthyFood> tmp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                tmp.add(new HealthyFood(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return tmp;
    }

    public static ArrayList<WesternFood> getWesternFood() {
        String file = "com.SonOfThoy.app/foods/ws.txt";
        String line;

        ArrayList<WesternFood> tmp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                tmp.add(new WesternFood(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return tmp;
    }

    public static ArrayList<SnackAndSweet> getSnackAndSweet() {
        String file = "com.SonOfThoy.app/foods/snack.txt";
        String line;

        ArrayList<SnackAndSweet> tmp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                tmp.add(new SnackAndSweet(line));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return tmp;
    }

}