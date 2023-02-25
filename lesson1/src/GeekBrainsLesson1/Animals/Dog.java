package GeekBrainsLesson1.Animals;

public class Dog extends Animal{
    public Dog(){
// такой конструктор жава предоставляет по умолчанию
    }
    public Dog(String name, String color, int age){
        /*конструктор стандартный для этого класа*//*
        *//*public - ключевое слово с уровнем доступа
        Dog - имя класса
        (String name, String color, int age)*/

        this.name = name;
        this.color = color;
        this.age = age;
    }
    @Override
    public void voice() {
        //super.voice(); // так будет вызван вариант метода родител
        System.out.println(name + " " + "gav!!!!");
    }
}
