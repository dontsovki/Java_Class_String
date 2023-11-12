package org.example.Pakcage;



public class Class_String_equals {

    /*Сравнение строк
Для сравнения строк можно воспользоваться методом equals(): */
    public static void num (){
        String x = "Test String";
        System.out.println("Test String".equals(x)); // true

    }

    /* Когда при сравнении строк нам не важен регистр,
    нужно использовать метод equalsIgnoreCase():*/
    public static void num1(){
        String x = "Test String";
        System.out.println("test string".equalsIgnoreCase(x)); // true
    }

    public static void main(String[] args) {
        num();
        num1();

    }
}
