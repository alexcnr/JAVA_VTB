package Lesson2;

/* public class Duck implements SuprFlyable, SwimAble{
    @Override
    public void fly() {
        System.out.println("Duck flies");

    }
    public void SuppaduppaFly(){

    }

    public void swim() {
        System.out.println(2);
    }
}
*/
public class Duck implements FlyAble, SwimAble{
    @Override
    public void fly() {
        System.out.println("Duck flies");

    }
    public void swim() {
        System.out.println(2);
    }
}