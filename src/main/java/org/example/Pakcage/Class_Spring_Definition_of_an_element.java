package org.example.Pakcage;



public class Class_Spring_Definition_of_an_element {

    /*Определение позиции элемента в строке
В языке Java String предоставляет набор методов для определения позиции символа/подстроки в строке:
indexOf(int ch)
indexOf(int ch, int fromIndex)
indexOf(String str)
indexOf(String str, int fromIndex)
lastIndexOf(int ch)
lastIndexOf(int ch, int fromIndex)
lastIndexOf(String str)
lastIndexOf(String str, int fromIndex)
Где:
ch — искомый символ (char)
str — искомая строка
fromIndex — позиция с которой нужно искать элемент
методы indexOf — возвращают позицию первого найденного элемента
методы lastIndexOf — возвращают позицию последнего найденного элемента
Если искомый элемент не найден, методы вернут в строке -1. */
    public static void num(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.indexOf('A')); // 0
        System.out.println(alphabet.indexOf('K')); // 10
        System.out.println(alphabet.indexOf('Z')); // 25
        System.out.println(alphabet.indexOf('Я')); // -1

    }

    /* Извлечение подстроки из строки
Для извлечения подстроки из строки класс String в Java предоставляет методы:
substring(int beginIndex)
substring(int beginIndex, int endIndex)*/
    public static void num2() {
        String filePath = "D:\\Movies\\Futurama.mp4";
        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        System.out.println(fileName); //9
    }

    /* Перевод строки в верхний/нижний регистр:
Класс String предоставляет методы для перевода строки в верхний и нижний регистры:
toLowerCase()
toUpperCase()*/

    public static void num3(){
        String fry = "Philip J. Fry";

        String lowerCaseFry = fry.toLowerCase();
        String upperCaseFry = fry.toUpperCase();

        System.out.println(lowerCaseFry); // philip j. fry
        System.out.println(upperCaseFry); // PHILIP J. FRY


    }

    public static void main(String[] args) {
        num();
        System.out.println("------------");
        num2();
        System.out.println("------------");
        num3();

    }


}
