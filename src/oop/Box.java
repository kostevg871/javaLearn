package oop;

public class Box {
    double width;
    double height;
    double length;

    // Constructor lessons
    // Create constructor
    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    Box(double size){
        this.height=size;
        this.width = size;
        this.length = size;
    }

    // Create param constructor
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Method lessons
    void showVolume(String nameBox) {
        double volume = returnVolume();
        System.out.println(nameBox + volume);
    }

    double returnVolume() {
        return width * height * length;
    }
}
