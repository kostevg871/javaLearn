package oop.main;

import oop.box.Box;
import oop.test.Human;
import oop.test.MyMath;

public class Main {
    public static void main(String[] args) {
        // OOP lessons
        Box myBox = new Box();
        myBox.setHeight(10.2);
        myBox.setLength(15);
        myBox.setWidth(11.3);
        Box box2 = new Box();
        Box box3 = new Box();
        box2.setHeight(20);
        box2.setLength(30);
        box2.setWidth(15);
        box3.setHeight(30);
        box3.setWidth(30);
        box3.setLength(30);
        double volumeBox2 = box2.getHeight() * box2.getLength() * box2.getWidth();
        double volumeBox3 = box3.getHeight() * box3.getWidth() * box3.getLength();
        double volume = myBox.getHeight() * myBox.getWidth() * myBox.getLength();
        System.out.println("volume1: " + volume + "\nvolumeBox2: " + volumeBox2 + "\nvolumeBox3: " + volumeBox3);

        // HomeWork in OOP
        Human human1 = new Human();
        human1.setName("Boris");
        human1.setAge(21);
        human1.setWeight(86);

        Human human2 = new Human();
        human2.setName("Leora");
        human2.setAge(25);
        human2.setWeight(85);

        Human human3 = new Human();
        human3.setName("Nik");
        human3.setAge(57);
        human3.setWeight(100);

        Human human4 = new Human();
        human4.setName("Tanya");
        human4.setAge(23);
        human4.setWeight(75);

        Human human5 = new Human();
        human5.setName("Albert");
        human5.setAge(55);
        human5.setWeight(68);

        double averageValue = (human1.getAge() + human2.getAge() + human3.getAge() + human4.getAge() + human5.getAge()) / (double) 5;
        System.out.println("All Human average value age: " + averageValue);

        //Method lessons
        Box boxMethod1 = new Box();
        Box boxMethod2 = new Box();
        boxMethod1.setLength(5);
        boxMethod1.setHeight(5);
        boxMethod1.setWidth(5);
        boxMethod2.setLength(10);
        boxMethod2.setWidth(10);
        boxMethod2.setHeight(10);
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
        Box boxPC = new Box(10, 12, 10);
        System.out.println("Param Constructor: " + boxPC.returnVolume());

        // Overload const
        Box boxConstOverload = new Box(33);
        boxConstOverload.showVolume("boxConstOverload ");

        // Object
        int result = boxConstOverload.compare(boxPC);
        // method compare
        switch (result) {
            case -1 -> System.out.println("our box less");
            case 0 -> System.out.println("our box equal");
            case 1 -> System.out.println("our box more");
        }

        // Obj param construct
        Box boxParam1 = new Box(10);
        Box boxParam2 = new Box(boxParam1);

        boxParam1.setDimens(10,10,10);

        Box boxParam3 = boxParam1.increase(2);

        int resultParam = boxParam1.compare(boxParam2);
        switch (resultParam) {
            case -1 -> System.out.println("our box less");
            case 0 -> System.out.println("our box equal");
            case 1 -> System.out.println("our box more");
        }

        boxParam1.showVolume("boxParam1: ");
        boxParam3.showVolume("BoxParam3: ");
        System.out.println(MyMath.square(20));
        System.out.println(MyMath.length(10));
        System.out.println(MyMath.area(10));
        System.out.println(MyMath.sum());

    }
}
