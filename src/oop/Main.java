package oop;

public class Main {
    public static void main(String[] args) {
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
    }
}
