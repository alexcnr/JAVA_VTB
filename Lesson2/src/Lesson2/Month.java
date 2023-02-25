package Lesson2;

public enum Month {
    // enum - перечисление, это урезанный вариант класса
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5),
    JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9),
    OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private int number; // сделали поле

    public int getNumber() {
        return number;
            }

    private Month(int number) // конструктор
    {
        this.number = number;

    }
/*
    Month() {
        this.number = number;
    }  */
}
