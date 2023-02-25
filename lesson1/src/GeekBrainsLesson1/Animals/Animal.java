package GeekBrainsLesson1.Animals;

public abstract class Animal /*суперкласс*/{
    /*абстрактный класс - не можем создать объект этого класса*/
    String name;
    String color;
    int age;
/*
    public Animal(){
        /*пустой конструктор чтобы без супер в последователе*/
//   }



/*конструктор 1*/
    public Animal(){
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 1;
    }

    public Animal(String name){

/*конструктор 2*/

        this.name = name;
        this.color = "Unknown";
        this.age = 1;
    }


    public Animal(String name, String color, int age){
        /*конструктор 2*/
        /*если его объявим, то в КЭТ уже надо передавать в супер*/
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

//    public void voice() {System.out.println(name + " - voice from Animal"); }

    public abstract void voice();
    /*абстрактный метод, его обязательно реализовывать у неабстрактных потомков*/
    /*его сделали абстрактным, так как его по разному будут реализовывать все потомки*/
    /*это абстрактный метод и значит он у абстрактного класса*/

}
