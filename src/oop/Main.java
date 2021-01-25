package oop;

public class Main {
    public static void main(String[] args) {
        // OOP lessons
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;
        Box box2 = new Box();
        Box box3 = new Box();
        box2.height = 20;
        box2.length = 30;
        box2.width = 15;
        box3.height = 30;
        box3.width = 30;
        box3.length = 30;
        double volumeBox2 = box2.height * box2.length * box2.width;
        double volumeBox3 = box3.height * box3.width * box3.length;
        double volume = myBox.height * myBox.width * myBox.length;
        System.out.println("volume1: " + volume + "\nvolumeBox2: " + volumeBox2 + "\nvolumeBox3: " + volumeBox3);

        // HomeWork in OOP
        Human human1 = new Human();
        human1.name = "Boris";
        human1.age = 21;
        human1.weight = 86;

        Human human2 = new Human();
        human2.name = "Leora";
        human2.age = 25;
        human2.weight = 85;

        Human human3 = new Human();
        human3.name = "Nik";
        human3.age = 57;
        human3.weight = 100;

        Human human4 = new Human();
        human4.name = "Tanya";
        human4.age = 23;
        human4.weight = 75;

        Human human5 = new Human();
        human5.name = "Albert";
        human5.age = 55;
        human5.weight = 68;

        double averageValue = (human1.age + human2.age + human3.age + human4.age + human5.age) / (double) 5;
        System.out.println("All Human average value age: " + averageValue);

        //Method lessons
        Box boxMethod1 = new Box();
        Box boxMethod2 = new Box();
        boxMethod1.length = 5;
        boxMethod1.height = 5;
        boxMethod1.width = 5;
        boxMethod2.length = 10;
        boxMethod2.width = 10;
        boxMethod2.height = 10;
        boxMethod1.showVolume("boxMethod 1: ");
        boxMethod2.showVolume("boxMethod 2: ");
        double volumeMethod1 = boxMethod1.returnVolume();
        double volumeMethod2 = boxMethod2.returnVolume();
        System.out.println("Result method returnVolume: " + volumeMethod1 + "  " + volumeMethod2);


        // Lessons param methods
        Box boxParam = new Box();
        boxParam.setDimens(20, 20, 20);
        System.out.println(boxParam.returnVolume());

        //Constructor lessons
        Box boxConstructor = new Box();
        System.out.println("Constructor: " + boxConstructor.returnVolume());

        //Param constructor
        Box boxPC = new Box(10,10,10);
        System.out.println("Param Constructor: " + boxPC.returnVolume());

        // Overload const
        Box boxConstOverload = new Box(10);
        boxConstOverload.showVolume("boxConstOverload ");
    }
}
