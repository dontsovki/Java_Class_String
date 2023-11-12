package org.example.Pakcage;

public class Class_String_toString {
    public Class_String_toString(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*Складывая объекты класса String с объектами других классов,
            мы приводим последние к строковому виду. Преобразование объектов
            других классов к строковому представлению выполняется через неявный вызов метода
            toString у объекта. Продемонстрируем это на следующем примере:  */
    private String name;

    //Переопределение метода

    @Override
    public String toString() {
        return "Человек с именем " + name;
    }

    public static void main(String[] args) {
        Class_String_toString max = new Class_String_toString("Макс");
        String out = "Java объект: " + max;
        System.out.println(out);
        // Вывод: Java объект: Человек с именем Макс

    }
}
