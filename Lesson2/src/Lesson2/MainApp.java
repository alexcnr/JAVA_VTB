package Lesson2;

public class MainApp {

    /*цель езать на разных и останавливать любое на каком бы ни поехал*/


    static class Human {
        private Transport currentTransport;
        private Magic magic;

        // ПОНИМАЮ ЭТО КАК ССЫЛКИ НА ОБЪЕКТЫ, КОТОРЫЕ РЕАЛИЗУЮТ ДАННЫЕ ИНТЕРФЕЙСЫ


        public void stop(){
            if (currentTransport != null){
                currentTransport.stop();
                currentTransport = null;
            }
            else {
                System.out.println("I am not going!!!");

            }

        }
        public void drive(Transport transport){
            transport.start();
            this.currentTransport = transport;
            /*car.run();*/
            /*lastCar = car;*/
        }
        public void SkateBoarsParkActions(){
            if (!(currentTransport instanceof Skateboard)){
                System.out.println("I have no skateboard");
                return;
            }
            Skateboard skateboard = (Skateboard) currentTransport;
            skateboard.start();
        }
       /* public void drive(Skateboard skateboard){
            skateboard.runskate();

        }
        public void drive(Bicycle bicycle){
            bicycle.runing();

        }    */
    }
    static class Car implements Transport{
        @Override
        public void start() {
            System.out.println("GO=CAR=public void start()");
        }
        @Override
        public void stop() {
            System.out.println("stop=CAR=public void stop()");

        }

    }
    static class Skateboard implements Transport, Magic{
        @Override
        public void doMagic() {
            System.out.println("doMagic");
        }

        @Override
        public void start() {
            System.out.println("GO=Skateboard=public void start()");
        }
        @Override
        public void stop() {
            System.out.println("stop=Skateboard=public void stop()");

        }
    }
    static  class Bicycle implements Transport {
        public void runing() {
            System.out.println("GO=Bicycle=GO");
        }

        @Override
        public void start() {
            System.out.println("GO=Bicycle=public void start()");
        }

        @Override
        public void stop() {
            System.out.println("stop=Bicycle=public void stop()");

        }
    }
        static  class Moto implements Transport{
            public void runing(){System.out.println("GO=Moto=GO");
            }

            @Override
            public void start() {
                System.out.println("GO=Moto=public void start()");
            }
            @Override
            public void stop() {
                System.out.println("stop=Moto=public void stop()");

            }
    }

    public static void main (String[] args){
        //Moto moto = new Moto();
        Transport transport = new Moto();
        Human human = new Human();
        human.stop();
        human.drive(transport);
        human.SkateBoarsParkActions();// проверка на скейте ли тогда го
        human.stop();


        FlyAble[] flyables = {
                new Duck(),
                //new Fish(),   - класс не реализует данный интерфейс, поэтому он сюда никак
                new Airplane()
        };

        for (FlyAble f : flyables){
            f.fly();
            }
    FlyAble SomethimgFlyable = new Duck();
        // можем так создать нечто летающее, т.е. любой объект
        SomethimgFlyable.fly(); //и можем у такого объекта только метод, который есть в интерфейсе
    }
}
