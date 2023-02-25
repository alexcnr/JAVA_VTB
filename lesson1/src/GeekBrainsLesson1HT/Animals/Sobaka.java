package GeekBrainsLesson1HT.Animals;

import GeekBrainsLesson1HT.Animal;

public class Sobaka extends Animal {
    public static int dog_counter;
    public static int animalsCount;



    public Sobaka( String name, int max_rundistance) {
        super("DOGG", name, max_rundistance);
        dog_counter ++;
        animalsCount++;

    }

    @Override
    public void swim(int swimdistance) {
        int dog_swimdistance = 10;
        if (swimdistance > dog_swimdistance) {System.out.println(name + " I cannot swim - " );
        } else {System.out.println(name + " swim - " + swimdistance + "m" ); }
    }
}

