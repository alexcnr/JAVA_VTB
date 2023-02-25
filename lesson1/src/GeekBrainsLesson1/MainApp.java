package GeekBrainsLesson1;

import java.util.HashMap;

import GeekBrainsLesson1.Animals.Animal;
import GeekBrainsLesson1.Animals.Cat;
import GeekBrainsLesson1.Animals.Dog;

public class MainApp {

    public static void main (String[] args) {

        /*cat.name = "BARSIK";*/
        /* cat.color = "White";*/
        /* cat.age = 2;*/
        Cat cat = new Cat("BASILAR", "White", 2);
        /*используя конструктор создаем объекты*/
        /*Cat - ссылка на объект или его наследника, new - выделить память
         * в "ХИТЕ" или "ХИПЕ" под объект типа  Cat */
        /*Имя_класса имя_переменной = new Имя_класса();
        * Имя_класса() в правой части выполняет вызов конструктора данного класса, который позволяет
подготовить объект к работе. */

        Cat cat2 = new Cat("BASILAR2", "White2", 3);


        Dog dog = new Dog("Bublik", "Yellow", 10);

        cat.info();
        cat2.info();
        cat.voice();
        dog.voice();



        /*HashMap<String, String> hm = new HashMap<String, String>();*/

        /*пример использования геттера и сеттера*/ /*
        cat.setName("A");
        System.out.println(cat.getName());
        */
        /*System.out.println("Cat.DoSomeThing();");
        Cat.DoSomeThing();

        new MainApp().DoSomeThing(); // 1 способ вызова*/
        /*создали объект и вызвали у него этот метод*/
        /*другого варианта вызвать статику нет*/


        /*    создадим массив объектов*//*
        Cat[] cats = new Cat[2]; //просто создать пустой массив нельзя
        cats[0] = new Cat("AA", "black", 5);
        cats[1] = new Cat("BB", "black-snow", 6);
        cats[0].info();*/

        Animal animal = new Cat("A", "B-color", 7);
        //создаем экземпляр от final путем наследования его родителя
        // то есть это ссылка на родителя, туда можно класть наследника
        //это нужно к примеру при создании массива разных объектов
        animal.voice();

        Animal[] CatsAndDogs = {
                new Cat("CatFromlist", "blue", 10),
                new Dog("DogFromlist", "bluedog", 12),
        };
        for (Animal o : CatsAndDogs) {
            o.voice();
        }

        Animal cat3 = new Dog("NewCat", "color new", 6);
        //Animal cat3 = new Cat("NewCat", "color new", 6);
        //cat3.catsMethod();  // ЭТО НЕ СРАБОТАЕТ!!!!!!!!!!!!
        //((Cat)cat3).catsMethod();  // только так, напрямую указываем что это именно кот
        if (cat3 instanceof Cat){
            ((Cat)cat3).catsMethod();
                    } else {
            System.out.println("IT IS  NOT A CAT!!!!!");
        }

        Object obj = new Cat("CatfromObject", "color", 7);
        //все классы наследуются от Object        JAVA


        Animal cat4 = new Cat("NewCat4", "color new", 6);
        System.out.println("cat4 - " + cat4);
        Animal dog4 = new Dog("NewDOg4", "color new", 5);
        System.out.println("dog4 - " + dog4);
    /*public void DoSomeThing(){
        System.out.println(8);
    }*/

        Box box1 = new Box("green", 10);
        Box box2 = new Box("green", 10);
        System.out.println(box1 == box2); // попытка сравнить дает false
        System.out.println(box1.equals(box2)); // попытка сравнить дает true
        //это потому что надо объяснить жаве структуру коробки...

    }

}
