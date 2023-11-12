package org.example.Pakcage;

public class Class_String_splitting_a_array {

    /*Разбиение строки на массив строк
Эту операцию выполняет метод split(String regex)

В качестве разделителя выступает строковое регулярное выражение regex.  */
    public static void num(){
        String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong";

        String[] peopleArray = people.split("; ");
        for (String human : peopleArray) {
            System.out.println(human);
        }

    }
    public static void main(String[] args) {
        num();
    }
}
