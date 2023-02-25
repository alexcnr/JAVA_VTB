package GeekBrainsLesson1HT.Animals;

public class Cat2 {
    private String name2;
    private String color2;
    static int age2;

    public Cat2(String name2, String color2, int age2){
        this.name2 = name2;
        this.color2 = color2;
        this.age2 = age2;
    }
    public String getName2(String name2){
        return name2;
    }

    public void setName2(String name2) {
        //сеттер для этого тоже. т.е. ограничений
        if (name2.length() > 3)
            this.name2 = name2;
    }

    public void info2(){
        System.out.println(name2 + " - " + age2);
    }
    public void meow2(){
        System.out.println(name2 + "MEOW222 it is a cat2");
    }

}
