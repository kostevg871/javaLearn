package oop.homework;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Sharia";
        dog1.breed = "dachshund";
        dog1.speed = 20;

        dog2.name = "Lucia";
        dog2.breed = "shepherd";
        dog2.speed = 2;

        dog1.run();
        dog2.run();

        String infoDog1 = dog1.info();
        String infoDog2 = dog2.info();

        System.out.println(infoDog1 + "\n"+infoDog2);
    }
}
