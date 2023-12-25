package Slovar;

import java.util.HashMap;
import java.util.Map;

public class Slovar {
    public static void main(String[] args) {

        Map<String,String> engRus = new HashMap<String,String>();

        engRus.put("Monday", "Понедельник");
        engRus.put("Tuesday", "Вторник");
        engRus.put("Wednesday", "Среда");
        engRus.put("Thursday", "Четверг");
        engRus.put("Friday", "Пятница");


        System.out.println(engRus.get("Monday"));
        System.out.println(engRus.get("Tuesday"));
        System.out.println(engRus.get("Wednesday"));
        System.out.println(engRus.get("Thursday"));
        System.out.println(engRus.get("Friday"));


        System.out.println(engRus.containsKey("Wednesday"));

        System.out.println(engRus.keySet());
        System.out.println(engRus.values());

        System.out.println(engRus.size());

        engRus.remove("Monday");

        System.out.println(engRus.toString());
    }
}
