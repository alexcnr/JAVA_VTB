package GeekBrainsLesson1HT;

public abstract class Animal {
    public String name;
    public String type;

    //int rundistance;
    int max_rundistance;
    public static int animalsCount = 0;


    //public Animal(String name, int rundistance, int max_rundistance){
    /*public Animal(){
        /*пустой конструктор чтобы без супер в последователе*/
    //}

    /*public Animal( int rundistance){

    }*/

        /*конструктор 2*/
    public Animal(String type, String name, int max_rundistance){

        /*конструктор 2*/
        animalsCount++;
        this.type = type;
        this.name = name;
        //this.rundistance = rundistance;
        this.max_rundistance = max_rundistance;

        //*this.color = "Unknown";
        //this.age = 1;*/
    }
    public void run(int rundistance) {

    if (rundistance < max_rundistance) {System.out.println(name + " - ran for - " + rundistance + "m");
    } else {System.out.println(name + " - I cannot run for - " + rundistance + "m");}

        }
    public void info(){
        System.out.println(name);
    }

    public void voice(){
        System.out.println(name + "VOICE!!!");
    }

    public abstract void swim(int swimdistance);

    //public abstract void swim(int swimdistance);
    /*абстрактный метод, его обязательно реализовывать у неабстрактных потомков*/

}
