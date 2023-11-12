package org.example.Pakcage;

public class Class_String_valueOf extends Class_String_toString{
    public Class_String_valueOf(String name) {
        super(name);
    }

    /*Перевод объекта/примитива в строку
Для перевода экземпляра любого Java-класса или любого примитивного типа данных к строковому
представлению, можно использовать метод String.valueOf():
     */

    public static void num(){
        String a = String.valueOf(1);
        String b = String.valueOf(12.0D);
        String c = String.valueOf(123.4F);
        String d = String.valueOf(123456L);
        String s = String.valueOf(true);
        String human = String.valueOf(new Class_String_toString("Alex"));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(human);

    }
    public static void main(String[] args) {
        num();

    }
}
