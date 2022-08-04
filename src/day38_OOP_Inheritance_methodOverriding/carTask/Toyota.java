package day38_OOP_Inheritance_methodOverriding.carTask;


    public class Toyota extends Car { // Toyota extends car claass features by extends keyword

        public Toyota( String model, int year, double price, String color, int miles) {
            super("Toyota", model, year, price, color, miles);
        }

       // generate e basark super keyword ıile constuctor ını oluşturacaksın ama parameters ı kontrol etmen lazım

        // parent class da contuctor varsa child class ada da olması lazım
        // parent class constructor ını child class olan toyota ya caall etmemiz lazım  ama farklı class larınc constructorla rı
        // call edilemz bunu aşmaın yolu super keyword kullnamaktır
        // parent class consrtructor ı default olsa parameters içermeze impliictly inherited edilecek ama değilse related problem uyarısı verir
        //public Car(String brand, String model, int year, double price, String color, int miles)  bu defarult değil
        //
        public void reliable(){
            System.out.println(brand+" "+model+" is reliable");
        }


        public void start(){
            System.out.println("Twist the key to ignition to start "+brand+" "+model);
        }


    }

/*
1. Toyota:
					extra methods:
							reliable()
 */
