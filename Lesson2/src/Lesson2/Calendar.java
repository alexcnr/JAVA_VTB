package Lesson2;
/*условие что в каждом месяце одно и то же количество дней*/
public class Calendar {
   /* public static final int MONTH_JANUARY = 1;
    public static final int MONTH_FABRUARY = 2;
    int month = MONTH_JANUARY;*/
    Month month = Month.JANUARY;
    Month month_2 = Month.FEBRUARY;

    public void Currentdateinfo(){

        System.out.println(month.getNumber() + " - month.getNumber()");
        System.out.println(month_2.getNumber() + " - month_2.getNumber()");
        System.out.println(month.name() + " - mmonth.name()");  //
        System.out.println(month.getClass() + " - month.getClass() ");    //
        System.out.println(month.hashCode() + " - month.hashCode() ");   //
        System.out.println(Month.JUNE);  //
    }
}
