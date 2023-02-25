package GeekBrainsLesson1HT;
/*1. Создать классы Собака, Домашний Кот , Тигр, Животное (можете добавить два-три своих
класса).
2. Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
препятствия.
3. У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет
печать в консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м' .
4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
проплыть.
5. * Добавить подсчет созданных Домашних Котов , Тигров , Собак , Животных .*/

/**/


import GeekBrainsLesson1.Animals.Dog;
import GeekBrainsLesson1HT.Animals.*;

import static GeekBrainsLesson1HT.Animal.animalsCount;
import static GeekBrainsLesson1HT.Animals.Cat.cat_counter;
import static GeekBrainsLesson1HT.Animals.Sobaka.dog_counter;


public class MainApp {
    public static void main (String[] args) {
        //System.out.println("HT");

        //Cat cat1 = new Cat("Ca1", 200);
        // cat1.run(150);
        //cat1.run(750);
        //cat1.swim(10);

        Cat2 cat2 = new Cat2("XXX", "GREEN", 56);

        /*
        * здесь cat2 - это не объект целиком!!! а ссылка на него
        * этот оператор new отвечает за выделение памяти в хипе
        * */
        /*cat2.color2 = "red";
        cat2.name2 = "jjj";
        cat2.age2 = 22;*/


        //cat2.meow2();
        Cat2 cat21 = new Cat2("YYY", "REDD", 20);

        cat2.info2();
        cat21.info2();

        Cat2[] cat2s = new Cat2[2]; // ЭТО МАССИВ ИЗ 2 ПУСТЫХ!!! ССЫЛОК
        //cat21[0].info2()    -   это ошибка!
        cat2s[0] = new Cat2("cat massiv0", "massiv color 0", 5);
        cat2s[1] = new Cat2("cat massiv1", "massiv color 1", 8);
        cat2s[0].info2();
        cat2s[1].info2();


        Sobaka dog1 = new Sobaka("Bobik", 500);
        dog1.run(450);
        dog1.swim(5);


        //GeekBrainsLesson1HT.Animal cat1 = new Cat("Cat000", 200);

        //  Animal[] animals = {
        //new Cat("Ca1", 200),
        //new Sobaka("Bobikkk", 500),

        // };
        Animal[] animals = {
                new HouseCat("CATCAT", 200),
                new Sobaka("Bobik001", 500),
                new Tiger("Tiger001", 2000)
        };
        for (Animal o : animals) {
            o.run(250);
            o.swim(10);
        }
        //int rezult = cat_counter + dog_counter + tiger_counter;
        System.out.println("cats_all - " + cat_counter);

        System.out.println("ALL animals - " + animalsCount);
        System.out.println(animalsCount);
    }
}
