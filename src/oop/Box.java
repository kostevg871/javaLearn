package oop;

public class Box {
    double width;
    double height;
    double length;

    // Constructor lessons
    // Create constructor
    Box() {
        width = 10;
        height = 10;
        length = 10;
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
        double volume = width * height * length;
        System.out.println(nameBox + volume);
    }

    double returnVolume() {
        return width * height * length;
    }
}
