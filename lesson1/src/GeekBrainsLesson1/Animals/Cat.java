package GeekBrainsLesson1.Animals;

public final class Cat extends Animal{

    //int ClawLength;

    /*здесь поля, они описывают свойства класса*/
    /*private- доступ только из этого класса,
    default - из класса + из пакета,
    protected - плюс любой наследник класса где бы он ни был,
    public -  - модификаторы доступа*/
    /*private  String name;
    private  String color;
    /*static int age;*/ /* static - поле общее для всех объектов данного класса*/
    /*то есть возраст будет у всех одинаковый*/
    /*private int age;*/
    /*
    public String getName(){
        /* геттер - это метод, который возвращает значение, лежащее в поле*/
        /*принцип инкапсулляции, т.е. максимально скрываем доступ к полям*/
   /*     return name;   */
//    }
  /*  public void setName(String name) {
        *//*сеттер чтобы изменять значение поля*//*
        *//*Сеттер позволяет добавлять ограничения на изменение полей*//*
        *//*если убрать сеттер, то по сути будет поле ридонли*//*
        *//*коррекция длины имени, но  при PUBLIC поле
        везде где будет происходить изменение этого поля надо будет такую проверку МОЖНО ЗАБЫТЬ*//*
        *//*if (name.length() > 4)*//*
        *//* {    *//*
            this.name = name; *//*this - это ссылка на поле объекта, у которого мы вызываем данный метод*//*
        *//*  }  *//*
    }*/


    /*public Cat(){    */
        /*поля инициализируется по умолчанию, то есть можно создать объект кота и не задавать ни имени ничего*/
   /* }        */


/*
    static int field1;
    static int field2;  */

    /*можно сделать отдельный статический блок инициализации*/
    /*это для предварительной настройки при загрузке класса*/
/*    static {
        field1 = 1;
        field2 = 2;
    }
    */


    //public Cat(String name, String color, int age, int ClawLength){
    public Cat(String name, String color, int age){

        /*Наследник в своем конструкторе первой строкой кода обязан вызвать конструктор родителя
        * super(); //  конструктор родителя
        * */
        /*конструктор стандартный для этого класа*/
        /* то есть это метод, который вызывается при создании объектов*/
        /*Ключевое слово this применяется в
данном случае для того, чтобы отличить аргумент конструктора от поля объекта*/

        super(name, color, age);
        //this.name = name;
        //this.color = color;
        //this.age = age;
        //this.ClawLength = ClawLength;
    }

    @Override
    public void voice() {
        //super.voice(); // так будет вызван вариант метода родител
        System.out.println(name + " " + "meow!!!!");
    }

    public void catsMethod(){
        System.out.println(" It is a catsMethod !!!");
    }

    @Override
    public String toString(){
        /* переопределение стандартных объектов в текст */
        return "CAT переопределение [" + name + " " + color + " " + age + "]";
    }

    /*    *//*здесь методы, они описывают поведение*//*
    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void meoW() {System.out.println(name + "meowwwww"); }

    public static void DoSomeThing(){
        *//*в статич методе нельзя пользоваться полями*//*

    System.out.println(123);
    System.out.println("Это public static void DoSomeThing() из public class Cat");

    }*/

}
