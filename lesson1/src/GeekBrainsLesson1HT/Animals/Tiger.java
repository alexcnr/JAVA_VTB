package GeekBrainsLesson1HT.Animals;

import GeekBrainsLesson1HT.Animal;

public class Tiger extends Cat {
    //public static int animalsCount;
    public Tiger(String name, int max_rundistance) {
        super("TIGER", name, max_rundistance);
        animalsCount ++;

    }

    @Override
    public  void swim(int swimdistance){
        int tg_swimdistance = 25;
        if (swimdistance > tg_swimdistance) {System.out.println(name + " I cannot swim - " );
        } else {System.out.println(name + " swim - " + swimdistance + "m" ); }
    }
}
