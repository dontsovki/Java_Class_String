package org.example.Pakcage;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Class_String_Converting_string_to_number {

    /* Часто бывает нужно перевести строку в число. У классов оберток примитивных типов есть методы,
которые служат как раз для этой цели. Все эти методы начинаются со слова parse. Рассмотрим ниже
перевод строки в целочисленное (Integer) и дробное (Double) числа: */
    public static void num(){
        Integer i = Integer.parseInt("12");
        Double d = Double.parseDouble("12.65D");

        System.out.println(i); // 12
        System.out.println(d); // 12.65

    }

    /*Рассмотрим пример, в котором мы преобразуем список строк в строку,
    разделяя каждую точкой с запятой:  */

    public static void num2(){
        List<String> people = Arrays.asList(
                "Philip J. Fry",
                "Turanga Leela",
                "Bender Bending Rodriguez",
                "Hubert Farnsworth",
                "Hermes Conrad",
                "John D. Zoidberg",
                "Amy Wong");

        String peopleString = String.join("; ", people);
        System.out.println(peopleString);
    }
    public static void main(String[] args) {
        num();
        System.out.println("--------------");
        num2();

    }
}
