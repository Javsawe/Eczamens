package Users;

import java.util.ArrayList;
import java.util.Collections;

public class User {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Иван");
        names.add("Андрей");
        names.add("Даша");
        names.add("Катя");

        Collections.sort(names);
        System.out.println(names);

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(23);
        ages.add(17);
        ages.add(34);
        Collections.sort(ages);
        System.out.println(ages);
    }
}

