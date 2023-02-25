package GeekBrainsLesson1HT.Animals;

public class HouseCat extends Cat{
    public static int animalsCount;
    public static int cat_counter;

    public HouseCat(String name, int max_rundistance) {
        super("HOME_CAT", name, max_rundistance);
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
