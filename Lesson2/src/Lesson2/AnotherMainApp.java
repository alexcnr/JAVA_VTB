package Lesson2;
/*тема перечисление*/
public class AnotherMainApp {

    //ЕСЛИ ДОБАВИТЬ СЛОВО STATIC, ТО ЭТО БУДЕТ НЕ ВНУТРЕННИЙ, А ВЛОЖЕННЫЙ КЛАСС, И ОН УЖЕ НЕ ПРИВЯЗАН К ВНЕШНЕМУ КЛАССУ
    class Inner  {
        int innerValue;

        public Inner(int innerValue){
            this.innerValue = innerValue;
        }
        public void  InnerMethod(){
            System.out.println(outerValue); // видит и внешний и внутренний
            System.out.println(innerValue);
            OuterMethod();   // может вызвать OuterMethod

        }
    }
    int outerValue;
    public void  OuterMethod(){
        System.out.println(outerValue);

        Inner inner = new Inner(10);

    }


    public static void main (String[] args){
        Calendar calendar = new Calendar();
        calendar.Currentdateinfo();

        //Inner inner2 = new Inner(20);  //  так не работает!!!
        // ПОТОМУ ЧТО ОБЪЕКТ ВНУТРЕННЕГО КЛАССА НЕ МОЖЕТ ЖИТЬ БЕЗ ВНЕШНЕГО КЛАССА!

        Inner inner = new AnotherMainApp().new Inner(20);



    }

}
