package GeekBrainsLesson1HT.Animals;

import GeekBrainsLesson1HT.Animal;

public abstract class Cat extends Animal {
   public static int cat_counter;
    public static int animalsCount;




    public Cat(String type, String name, int max_rundistance) {
        super(type, name, max_rundistance);
        cat_counter ++;
        animalsCount++;

    }


    @Override
    public void swim(int swimdistance) {
        int cat_swimdistance = 0;
        if (swimdistance > cat_swimdistance) {System.out.println(name + " I cannot swim - " );
        }
    }


}
